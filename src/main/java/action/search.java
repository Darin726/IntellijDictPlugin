package action;

import com.google.gson.Gson;
import com.intellij.codeInsight.hint.HintManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import data.Constant;
import data.DictJson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by darin on 17-2-14.
 */
public class search extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        final Editor editor = e.getData(CommonDataKeys.EDITOR);

        if (editor == null)
            return;

        SelectionModel selectionModel = editor.getSelectionModel();


        if (selectionModel == null)
            return;

        String selectedText = selectionModel.getSelectedText();

        if (selectedText == null)
            return;

        String result = getTranslateFromStrings(searchWords(selectedText));

        if ((result == null || result.length() == 0) && selectedText.length() > 0)
            result = "Sorry, Can't tanslate this word";

        HintManager.getInstance().showInformationHint(editor, result);

    }


    public String searchWords(String word) {
        try {
            URL url = new URL(Constant.urlOfYouDao + word);
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            System.out.println(sb.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }


    private String getTranslateFromStrings(String originString) {

        if (originString == null || !originString.contains("global.translatedJson"))
            return null;

        int index1 = originString.indexOf("global.translatedJson = ");

        String aaa = originString.substring(index1);

        int index2 = aaa.indexOf("};");

        System.out.println(index1);


        System.out.println(index2);

        String finalString = originString.substring(index1 + "global.translatedJson = ".length(), index1 + index2 + 1);

        System.out.println(finalString);

        Gson j = new Gson();

        final DictJson dictJson = j.fromJson(finalString, DictJson.class);

        if (dictJson == null)
            return null;

        StringBuilder builder = new StringBuilder();

        List<String> results = dictJson.getSmartResult().getEntries();

        if (results != null && results.size() > 1) {
            results.forEach(s -> {
                if (s.length() > 0)
                    builder.append(s).append("\n");
            });
        }

        return builder.toString();
    }

}
