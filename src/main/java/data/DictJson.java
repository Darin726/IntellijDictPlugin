package data;

import java.util.List;

/**
 * Created by darin on 17-2-14.
 */
public class DictJson {

    /**
     * type : EN2ZH_CN
     * errorCode : 0
     * elapsedTime : 0
     * translateResult : [[{"src":"condition","tgt":"条件"}]]
     * smartResult : {"type":1,"entries":["","n. 条件；情况；环境；身份","vt. 决定；使适应；使健康；以\u2026为条件"]}
     */

    private String type;
    private int errorCode;
    private int elapsedTime;
    private SmartResultBean smartResult;
    private List<List<TranslateResultBean>> translateResult;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public SmartResultBean getSmartResult() {
        return smartResult;
    }

    public void setSmartResult(SmartResultBean smartResult) {
        this.smartResult = smartResult;
    }

    public List<List<TranslateResultBean>> getTranslateResult() {
        return translateResult;
    }

    public void setTranslateResult(List<List<TranslateResultBean>> translateResult) {
        this.translateResult = translateResult;
    }

    public static class SmartResultBean {
        /**
         * type : 1
         * entries : ["","n. 条件；情况；环境；身份","vt. 决定；使适应；使健康；以\u2026为条件"]
         */

        private int type;
        private List<String> entries;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getEntries() {
            return entries;
        }

        public void setEntries(List<String> entries) {
            this.entries = entries;
        }
    }

    public static class TranslateResultBean {
        /**
         * src : condition
         * tgt : 条件
         */

        private String src;
        private String tgt;

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getTgt() {
            return tgt;
        }

        public void setTgt(String tgt) {
            this.tgt = tgt;
        }
    }
}
