package action;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import data.DictJson;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by darin on 17-2-14.
 */
public class searchTest {



    @Test
    public void test() {

        String a = new search().searchWords("hello");

        if(a == null)
            return;

        int index1 = a.indexOf("global.translatedJson = ");

        String aaa = a.substring(index1);

        int index2 = aaa.indexOf("};");

        System.out.println(index1);


        System.out.println(index2);

        String finalString = a.substring(index1+"global.translatedJson = ".length(),index1+index2+1);

        System.out.println(finalString);

        Gson j  = new Gson();

        final DictJson dictJson = j.fromJson(finalString, DictJson.class);

        System.out.println(dictJson.toString());
    }


    private String a = "<!DOCTYPE html>\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "    <head>\n" +
            "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
            "        <title>在线翻译_有道</title>\n" +
            "        <meta name=\"keywords\" content=\"在线翻译\"/>\n" +
            "        <meta name=\"description\" content=\"有道翻译提供即时免费的中、英、日、韩、法、俄、西班牙、葡萄牙文全文翻译、网页翻译服务。\"/>\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.4, minimum-scale=1.0, maximum-scale=2.0\"/>\n" +
            "        <link rel=\"canonical\" href=\"http://fanyi.youdao.com\"/>\n" +
            "        <link href=\"http://shared.ydstatic.com/plugins/search-provider.fanyi.xml\" title=\"有道翻译\" type=\"application/opensearchdescription+xml\" rel=\"search\"/>\n" +
            "        <link rel=\"shortcut icon\" href=\"http://shared.ydstatic.com/images/favicon.ico\" type=\"image/x-icon\" />\n" +
            "        <link href=\"http://shared.ydstatic.com/fanyi/v3.2/styles/s/g3.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "        <link href=\"http://shared.ydstatic.com/fanyi/v3.2/styles/s/fanyi.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "    </head>\n" +
            "    <body class=\"open result-default\">\n" +
            "        <div class=\"c-header c-header-ext\">\n" +
            "            <a class=\"c-logo\" href=\"http://fanyi.youdao.com/?keyfrom=fanyi.logo\">有道 - 网易旗下搜索</a>\n" +
            "            <h1 class=\"yd-fy-desp\">免费、即时的多语种在线翻译</h1>\n" +
            "            <div class=\"user-info\">\n" +
            "                <div class=\"c-sust\">\n" +
            "                    <a href=\"http://f.youdao.com/login.do?back_url=http%3A%2F%2Ffanyi.youdao.com&service=fanyi\">登录</a>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div id=\"w\" class=\"cf\">\n" +
            "            <div id=\"transBackground\">\n" +
            "                <div id=\"main\" class=\"cf\">\n" +
            "                    <div id=\"transBtnTip\">\n" +
            "                        <div id=\"transBtnTipInner\">\n" +
            "                点击翻译按钮继续，查看网页翻译结果。\n" +
            "                \n" +
            "                            <p class=\"ar\">\n" +
            "                                <a href=\"#\" id=\"transBtnTipOK\">我知道了</a>\n" +
            "                            </p>\n" +
            "                            <b id=\"transBtnTipArrow\"></b>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <div id=\"inputMod\" class=\"column fl\">\n" +
            "                        <div class=\"wrapper\">\n" +
            "                            <form action=\"\" method=\"post\" id=\"transForm\" name=\"transForm\">\n" +
            "                                <div class=\"clearall\">\n" +
            "                                    <div id=\"clearInput\" class=\"clog-js\">\n" +
            "                                        <div class=\"clearnotice\">清空内容</div>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"row border content\" id=\"inputContent\">\n" +
            "                                    <textarea id=\"inputText\" class=\"text\" dir=\"ltr\" tabindex=\"1\" wrap=\"SOFT\" name=\"i\" placeholder=\"请输入要翻译的文字，输入网址可翻译该网页内容\">condition</textarea>\n" +
            "                                    <div class=\"typo-suggest\">您是不是要翻译： \n" +
            "                                        <a class=\"spell-corrected\" href=\"#\"></a>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"row\">\n" +
            "                                    <div id=\"customSelectBtn\" class=\"normalbtn\" data-selected=\"AUTO\">\n" +
            "                                        <span class=\"btn_text\">自动检测语言</span>\n" +
            "                                        <span id=\"outputLang\"></span>\n" +
            "                                        <b class=\"btn_arrow\"></b>\n" +
            "                                        <ul id=\"customSelectOption\">\n" +
            "                                            <li class=\"on\">\n" +
            "                                                <a val=\"AUTO\" href=\"#\">自动检测语言</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2EN\" href=\"#\">中文　»　英语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2JA\" href=\"#\">中文　»　日语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2KR\" href=\"#\">中文　»　韩语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2FR\" href=\"#\">中文　»　法语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2RU\" href=\"#\">中文　»　俄语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2SP\" href=\"#\">中文　»　西语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"ZH_CN2PT\" href=\"#\">中文　»　葡语</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"EN2ZH_CN\" href=\"#\">英语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"JA2ZH_CN\" href=\"#\">日语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"KR2ZH_CN\" href=\"#\">韩语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"FR2ZH_CN\" href=\"#\">法语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"RU2ZH_CN\" href=\"#\">俄语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"SP2ZH_CN\" href=\"#\">西语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                            <li>\n" +
            "                                                <a val=\"PT2ZH_CN\" href=\"#\">葡语　»　中文</a>\n" +
            "                                            </li>\n" +
            "                                        </ul>\n" +
            "                                        <input type=\"hidden\" value=\"AUTO\" name=\"type\" id=\"customSelectVal\">\n" +
            "                        \n" +
            "                                    </div>\n" +
            "                                    <a type=\"submit\" id=\"translateBtn\" href=\"#\"\n" +
            "                           title=\"Enter自动提交\" value=\"自动翻译\" name=\"action\" class=\"button translateBtn\"></a>\n" +
            "                                    <a type=\"button\" id=\"atBtn\" href=\"#\"\n" +
            "                           title=\"\" value=\"人工翻译\" name=\"forward\" class=\"button atNormalBtn\"></a>\n" +
            "                                    <a id=\"atLink\" data-pos=\"web.i.bottom\" class=\"clog-js\" data-clog=\"ATBUTTON_CLICK\" href=\"#\"></a>\n" +
            "                                </div>\n" +
            "                                <div id=\"atBtnhover\">\n" +
            "                                    <div class=\"arrow\">\n" +
            "                                        <em></em>\n" +
            "                                        <span></span>\n" +
            "                                    </div>\n" +
            "                                    <p class=\"clog-notice\">专业译员随时待命，\n" +
            "                                        <br/>\n" +
            "                                        <span class=\"time-num\"></span>\n" +
            "                        返回精准译文\n" +
            "                                        <br/>\n" +
            "                                        <span class=\"polish-publish\">【母语润色服务,全新上线】</span>\n" +
            "                                    </p>\n" +
            "                                </div>\n" +
            "                                <!-- end of translate_pro suggest -->\n" +
            "                \n" +
            "                            </form>\n" +
            "                        </div>\n" +
            "                        <!-- end of wrapper -->\n" +
            "        \n" +
            "                    </div>\n" +
            "                    <!-- end of div inputMod -->\n" +
            "                    <div id=\"outputMod\" class=\"column fr\">\n" +
            "                        <div class=\"wrapper\">\n" +
            "                            <!-- end of entryList -->\n" +
            "                            <div class=\"row-hidden\" id=\"outputHidden\"></div>\n" +
            "                            <div id=\"translated\">\n" +
            "                                <div class=\"row\">\n" +
            "                                    <div class=\"row\" id=\"outputText\"></div>\n" +
            "                                </div>\n" +
            "                                <div id=\"modeWrapper\" class=\"read-mode\">\n" +
            "                                    <a class=\"open-reading-mode title\" href=\"#\" title=\"\" hidefocus></a>\n" +
            "                                    <a class=\"close-reading-mode title\" href=\"#\" title=\"\" hidefocus></a>\n" +
            "                                    <div class=\"opennotice\">\n" +
            "                                        <div class=\"arrow\">\n" +
            "                                            <em></em>\n" +
            "                                            <span></span>\n" +
            "                                        </div>\n" +
            "                                全屏阅读\n" +
            "                                    </div>\n" +
            "                                    <div class=\"closenotice\">\n" +
            "                                        <div class=\"arrow\">\n" +
            "                                            <em></em>\n" +
            "                                            <span></span>\n" +
            "                                        </div>\n" +
            "                                关闭全屏阅读\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"row desc\">\n" +
            "                                    <div id=\"selectorSwitcher\" class=\"selector-sprite\" style=\"display:none;\">\n" +
            "                                        <span id=\"selectorStatus\">划词</span>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"read-mode\" id=\"compareMode\">\n" +
            "                                        <label class=\"compare-mode compare-disable\" for=\"compare\">\n" +
            "                                            <input id=\"compare\" name=\"compare\" class=\"clog-js\" type=\"checkbox\"\n" +
            "                                       data-clog=\"COMPARE_CLICK\" data-pos=\"web.o.righttop\" />\n" +
            "                                            <span class=\"compare-message\">双语对照</span>\n" +
            "                                        </label>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"tool\">\n" +
            "                                        <a href=\"#\" id=\"speech\" title=\"\"></a>\n" +
            "                                        <a href=\"#\" id=\"resultScore\"></a>\n" +
            "                                        <div class=\"speechnotice\">\n" +
            "                                            <div class=\"arrow\">\n" +
            "                                                <em></em>\n" +
            "                                                <span></span>\n" +
            "                                            </div>\n" +
            "                            朗读\n" +
            "                                        </div>\n" +
            "                                        <div class=\"copynotice\">\n" +
            "                                            <div class=\"arrow\">\n" +
            "                                                <em></em>\n" +
            "                                                <span></span>\n" +
            "                                            </div>\n" +
            "                                            <span class=\"copy-notice\">复制</span>\n" +
            "                                        </div>\n" +
            "                                        <a class=\"actions copyIt-js\">\n" +
            "                                            <span id=\"copyOutput\" class=\"copy-init\"></span>\n" +
            "                                        </a>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <!-- end translated -->\n" +
            "            \n" +
            "                        </div>\n" +
            "                        <!-- end of wrapper -->\n" +
            "                        <div class=\"row cf\" id=\"addons\">\n" +
            "                            <div class=\"scorearrow\">\n" +
            "                                <em></em>\n" +
            "                                <span></span>\n" +
            "                            </div>\n" +
            "                            <div id=\"star\">\n" +
            "                                <p class=\"star_show\">翻译结果评分：</p>\n" +
            "                                <p class=\"star_result\">你的评分：</p>\n" +
            "                                <p id=\"rating\">\n" +
            "                                    <a href=\"#\" class=\"rank rank_1\" title=\"1分\" data-score=\"1\" hidefocus=\"true\"></a>\n" +
            "                                    <a\n" +
            "                            href=\"#\" class=\"rank rank_2\" title=\"2分\" data-score=\"2\" hidefocus=\"true\"></a>\n" +
            "                                    <a\n" +
            "                            href=\"#\" class=\"rank rank_3\" title=\"3分\" data-score=\"3\" hidefocus=\"true\"></a>\n" +
            "                                    <a\n" +
            "                            href=\"#\" class=\"rank rank_4\" title=\"4分\" data-score=\"4\" hidefocus=\"true\"></a>\n" +
            "                                    <a\n" +
            "                            href=\"#\" class=\"rank rank_5\" title=\"5分\" data-score=\"5\" hidefocus=\"true\"></a>\n" +
            "                                    <input id=\"rating_score\" type=\"hidden\" name=\"score\" value=\"\"/>\n" +
            "                                </p>\n" +
            "                                <span id=\"rating_1\" class=\"rating_1\"></span>\n" +
            "                            </div>\n" +
            "                            <!-- <span id=\"suggestYou\">TODO\n" +
            "                </span> -->\n" +
            "            \n" +
            "                        </div>\n" +
            "                        <div class=\"suggest\">\n" +
            "                            <div id=\"suggestYou\">\n" +
            "                                <!-- TODO -->\n" +
            "            \n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <!-- end of div outputMod -->\n" +
            "                    <div id=\"errorHolder\">\n" +
            "                        <span class=\"error_text\"></span>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <!-- end of main -->\n" +
            "    \n" +
            "            </div>\n" +
            "            <div class=\"sponsor-content\">\n" +
            "                <div id=\"sponsor\" class=\"cf\">\n" +
            "                    <div class=\"more-services-list\">\n" +
            "                        <table id=\"trans_tools\" class=\"cf\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "                            <tr>\n" +
            "                                <td>\n" +
            "                                    <h3 class=\"h2-sponsor\">\n" +
            "                                        <div class=\"icon2\">\n" +
            "                                            <a data-pos=\"web.moretool\" class=\"clog-js\" data-clog=\"MDICT_CLICK\" title=\"有道翻译官\"\n" +
            "                           href=\"http://fanyiguan.youdao.com/?vendor=fanyiweb\" target=\"_blank\">\n" +
            "                                                <p class=\"icon-notice1\">\n" +
            "                                                    <span>有道</span>翻译官\n" +
            "                                                </p>\n" +
            "                                                <p class=\"icon-notice2\">52种语言的随身翻译，支持语音翻译及拍照翻译~</p>\n" +
            "                                                <span class=\"icon-png2\"></span>\n" +
            "                                            </a>\n" +
            "                                        </div>\n" +
            "                                    </h3>\n" +
            "                                    <div class=\"vertical\"></div>\n" +
            "                                </td>\n" +
            "                                <td>\n" +
            "                                    <h3 class=\"h1-sponsor\">\n" +
            "                                        <div class=\"icon1\">\n" +
            "                                            <a id=\"fufeiLink\" data-pos=\"web.moretool\" class=\"clog-js\" data-clog=\"FUFEI_CLICK\" title=\"有道专业翻译\"\n" +
            "                           href=\"http://f.youdao.com/?vendor=fanyibottom\" target=\"_blank\">\n" +
            "                                                <p class=\"icon-notice1\">\n" +
            "                                                    <span>有道</span>人工翻译 /\n" +
            "                                                    <span class=\"polish\">母语润色</span>\n" +
            "                                                </p>\n" +
            "                                                <p class=\"icon-notice2\">全球最优秀的译员时刻待命，专业、精准、地道！</p>\n" +
            "                                                <span class=\"icon-png1\"></span>\n" +
            "                                            </a>\n" +
            "                                        </div>\n" +
            "                                    </h3>\n" +
            "                                    <div class=\"second-vertical vertical\"></div>\n" +
            "                                </td>\n" +
            "                                <td class=\"last-cell\">\n" +
            "                                    <h3 class=\"h3-sponsor\">\n" +
            "                                        <div class=\"icon3\">\n" +
            "                                            <a id=\"appWebsite\" data-pos=\"web.moretool\" data-pos=\"web.moretool\" class=\"clog-js\" data-clog=\"DOWNLOAD_CLICK\" title=\"有道词典 桌面版\"\n" +
            "                           href=\"http://cidian.youdao.com/multi.html?vendor=fanyiweb\" target=\"_blank\">\n" +
            "                                                <p class=\"icon-notice1\" id=\"downloadApp\">\n" +
            "                                                    <span>有道</span>词典 桌面版\n" +
            "                                                </p>\n" +
            "                                                <p class=\"icon-notice2\">支持全文翻译，智能调整语序，支持屏幕取词，快来点击下载~</p>\n" +
            "                                            </a>\n" +
            "                                        </div>\n" +
            "                                        <a data-pos=\"web.moretool\" href=\"http://codown.youdao.com/cidian/YoudaoDict_youdao.fanyiindex.exe\" class=\"dict-client clog-js\" id=\"dictClient\" data-clog=\"DOWNLOAD_CLIENT\" title=\"有道词典 桌面版\" target=\"_blank\"></a>\n" +
            "                                        <div class=\"dict-notice\">\n" +
            "                                            <div class=\"arrow\">\n" +
            "                                                <em></em>\n" +
            "                                                <span></span>\n" +
            "                                            </div>\n" +
            "                           下载有道词典\n" +
            "                                        </div>\n" +
            "                                    </h3>\n" +
            "                                    <div class=\"vertical\"></div>\n" +
            "                                </td>\n" +
            "                            </tr>\n" +
            "                        </table>\n" +
            "                        <!-- 右侧悬浮窗 -->\n" +
            "                        <div class=\"suspend\">\n" +
            "                            <div class=\"qrCode\"></div>\n" +
            "                            <div class=\"qrcodeHover\">\n" +
            "                                <div class=\"codearrow\">\n" +
            "                                    <em></em>\n" +
            "                                    <span></span>\n" +
            "                                </div>\n" +
            "                                <p>\n" +
            "            扫描二维码\n" +
            "                                    <br>\n" +
            "            关注有道人工翻译\n" +
            "        \n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                            <a class=\"clog-js\" data-clog=\"SURVEY_CLICK\" data-pos=\"web.index.bottom\" target=\"_blank\"  href=\"http://survey2.163.com/html/fanyis201103a2/paper.html?id=946648098@125.121.235.197@0\">\n" +
            "                                <div id=\"research\"></div>\n" +
            "                            </a>\n" +
            "                        </div>\n" +
            "                        <!-- end of suspend -->    \n" +
            "                    </div>\n" +
            "                    <!--广告-->\n" +
            "                    <div id=\"advertisement\"></div>\n" +
            "                    <div id=\"advertText\" style=\"margin-top:5px;\"></div>\n" +
            "                </div>\n" +
            "                <!-- end of div sponsor -->\n" +
            "    \n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <!-- end of w -->\n" +
            "        <!-- map form for at btn -->\n" +
            "        <form id=\"mapForm\" target=\"_blank\" method=\"POST\" action=\"http://f.youdao.com/?path=fanyi&vendor=fanyiinput\"></form>\n" +
            "        <div id=\"YOUDAO_SELECTOR_WRAPPER\" bindTo=\"inputText:outputText\"\n" +
            "     style=\"display:none; z-index: 101; margin:0; border:0; padding:0; width:320px; height:240px;\"></div>\n" +
            "        <script type=\"text/javascript\"\n" +
            "        src=\"http://fanyi.youdao.com/openapi.do?keyfrom=fanyiweb&type=selector&version=1.2&select=off&translate=on\"\n" +
            "        charset=\"utf-8\"></script>\n" +
            "        <div id=\"c_footer\">\n" +
            "            <a href=\"about.html\">关于有道翻译</a>\n" +
            "            <span class=\"c_fnl\">|</span>\n" +
            "            <a href=\"http://fanyi.youdao.com/openapi\">有道翻译API</a>\n" +
            "            <span class=\"c_fnl\">|</span>\n" +
            "            <a href=\"http://www.youdao.com/?keyfrom=fanyi.copyright\">有道首页</a>\n" +
            "            <span class=\"c_fnl\">|</span>\n" +
            "            <a href=\"http://dsp.youdao.com/\">有道智选</a>\n" +
            "            <span class=\"c_fnl\">|</span>\n" +
            "            <a href=\"http://www.youdao.com/about/index.html\">关于有道</a>\n" +
            "            <span class=\"c_fnl\">|</span>\n" +
            "            <a href=\"http://i.youdao.com\">官方博客</a>\n" +
            "            <p class=\"c_fcopyright\">&copy; 2017 网易公司 京ICP证080268号</p>\n" +
            "        </div>\n" +
            "        <script type=\"text/javascript\">\n" +
            "    var global = {};\n" +
            "                                                                                                                                                                                                          global.translatedJson = {\"type\":\"EN2ZH_CN\",\"errorCode\":0,\"elapsedTime\":0,\"translateResult\":[[{\"src\":\"condition\",\"tgt\":\"条件\"}]], \"smartResult\":{\"type\":1,\"entries\":[\"\",\"n. 条件；情况；环境；身份\",\"vt. 决定；使适应；使健康；以\\u2026为条件\"]}};\n" +
            "\n" +
            "\n" +
            "\n" +
            "    var abtest = \"0\";\n" +
            "    global.abTest = \"0\";\n" +
            "    global.sessionFrom = \"null\";\n" +
            "</script>\n" +
            "        <script type=\"text/javascript\" src=\"http://shared.ydstatic.com/ead/js/dict_req_web_1.1.js\"></script>\n" +
            "        <script data-main=\"/fanyi\" type=\"text/javascript\" src=\"http://shared.ydstatic.com/fanyi/v3.2/scripts/fanyi.js\"></script>\n" +
            "        <div id=\"custheme\"> </div>\n" +
            "        <!-- START NetEase Devilfish 2006 -->\n" +
            "        <script src=\"http://analytics.163.com/ntes.js\" type=\"text/javascript\"></script>\n" +
            "        <script type=\"text/javascript\">\n" +
            "  _ntes_nacc = \"ydfanyiweb\";\n" +
            "  neteaseTracker();\n" +
            "</script>\n" +
            "        <!-- END NetEase Devilfish 2006 -->\n" +
            "        <!-- START rlog -->\n" +
            "        <script type=\"text/javascript\">\n" +
            "  __rl_npid = \"fanyiweb\";\n" +
            "  (function() {\n" +
            "    var _rl = document.createElement('script');\n" +
            "    _rl.type = 'text/javascript'; _rl.async = true;\n" +
            "    _rl.src = 'http://rlogs.youdao.com/rlog.js';\n" +
            "    var s = document.getElementsByTagName('script')[0];\n" +
            "    s.parentNode.insertBefore(_rl, s);\n" +
            "  })();\n" +
            "</script>\n" +
            "        <!-- END rlog -->\n" +
            "        <!-- 判断平台进行下载客户端 -->\n" +
            "        <script type=\"text/javascript\">\n" +
            "    (function (){\n" +
            "        var av = navigator.appVersion.toLowerCase() || '';\n" +
            "        var is = {};\n" +
            "        var dictClientEle = document.getElementById('dictClient');\n" +
            "        var downloadApp = document.getElementById('downloadApp');\n" +
            "        var appWebsite = document.getElementById('appWebsite');\n" +
            "        var href = dictClientEle.href;\n" +
            "        is.mac = /mac/i.test(av);\n" +
            "        is.win = /win/i.test(av);\n" +
            "        is.ipad = /ipad/i.test(av);\n" +
            "        is.linux = /linux/i.test(av);\n" +
            "        is.iphone = /iphone/i.test(av);\n" +
            "        is.android = /android/i.test(av);\n" +
            "        if (is.win) {\n" +
            "            href = \"http://codown.youdao.com/cidian/YoudaoDict_youdao.fanyiindex.exe\";\n" +
            "        } else if (is.mac) {\n" +
            "            if (is.iphone) {\n" +
            "                href = \"https://itunes.apple.com/cn/app/id353115739?mt=8\";\n" +
            "            } else if (is.ipad) {\n" +
            "                href = \"https://itunes.apple.com/cn/app/id388358640?mt=8\";\n" +
            "            } else {\n" +
            "                appWebsite.href = \"http://cidian.youdao.com/index-mac.html?vendor=fanyiweb\";\n" +
            "                downloadApp.innerHTML = \"\n" +
            "            <span>有道</span>词典 Mac版\";\n" +
            "                href = \"http://codown.youdao.com/cidian/download/MacDict_fanyiindex.dmg\";\n" +
            "            }\n" +
            "        } else if (is.linux) {\n" +
            "            href = \"http://cidian.youdao.com/index-linux.html?vendor=fanyiweb\";\n" +
            "        } else if (is.android) {\n" +
            "            href = \"http://codown.youdao.com/dictmobile/youdaodict_android_youdaoweb.apk\";\n" +
            "        }\n" +
            "        dictClientEle.href = href;\n" +
            "    })();\n" +
            "        </script>\n" +
            "        <!-- end -->\n" +
            "\n" +
            "\n" +
            "\n" +
            "    </body>\n" +
            "</html>";
}