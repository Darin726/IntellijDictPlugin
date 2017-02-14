package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;

/**
 * Created by darin on 17-2-14.
 */
public class search extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        final Editor editor = e.getData(CommonDataKeys.EDITOR);

        if(editor == null)
            return;

        SelectionModel selectionModel = editor.getSelectionModel();


        if(selectionModel ==null)
            return;

        String eee = selectionModel.getSelectedText();

        if(eee == null)
            return;
        System.out.println(eee);

    }
}
