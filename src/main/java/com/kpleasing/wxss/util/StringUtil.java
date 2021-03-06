package com.kpleasing.wxss.util;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class StringUtil {
	
	/**
	 * 32 位UUID全球唯一码
	 * @return
	 */
	public static String getSerialNo32() {
		return UUID.randomUUID().toString().replace("-","");
	}
	
	
	/**
	 * 年月日時分秒6位随机数
	 * yyyyMMddHHmmssxxxxxx
	 * @return
	 */
	public static String getDateSerialNo6() {
		return DateUtil.getCurrentDate(DateUtil.yyyyMMddHHmmss) + RandomStringUtils.randomNumeric(6);
	}
	
	
	/**
	 * 随机验证码
	 * @return
	 */
	public static String getRandomVerifCode6() {
		return RandomStringUtils.randomNumeric(6);
	}
	
	
	    
	/**
	 * 中文姓名转换
	 * @param ChineseLanguage
	 * @return
	 */
    public static String toPingyin(String ChineseLanguage){
        char[] cl_chars = ChineseLanguage.trim().toCharArray();
        String pinyin = "";
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);     // 输出拼音全部大写
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  // 不带声调
        try {
            for (int i = 0; i < cl_chars.length; i++) {
                String str = String.valueOf(cl_chars[i]);
                if (str.matches("[\u4e00-\u9fa5]+")) {    // 如果字符是中文,则将中文转为汉语拼音,并取第一个字母
                	pinyin += PinyinHelper.toHanyuPinyinStringArray(cl_chars[i], defaultFormat)[0];
                } else if (str.matches("[0-9]+")) {     // 如果字符是数字,取数字
                	pinyin += cl_chars[i];
                } else if (str.matches("[a-zA-Z]+")) {   // 如果字符是字母,取字母
                	pinyin += cl_chars[i];
                } else {
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return pinyin;
    }
}
