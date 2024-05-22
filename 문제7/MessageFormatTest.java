package test;

import java.text.MessageFormat;

public class MessageFormatTest {
    public static void main(String[] args) {
        Object[][] datas = {
                {"세종대왕", 1, "조선"},
                {"오바마", 2, "미국"},
                {"징기스칸", 3, "몽고"},
        };

        for (int i=0; i< datas.length; i++){
            String person = MessageFormat.format("이름 : {0}      번호 :  {1}       국적 : {2}", datas[i]);
            System.out.println(person);
        }



    }
}
