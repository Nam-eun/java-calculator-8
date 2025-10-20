package calculator;

import java.util.regex.Pattern;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = readLine();

        int result = Change(input);

        System.out.println("결과 : " + result);
    }

    public static int Change(String input){

        String[] arr = {};
        String[] arr_pre = {};

        if(input.indexOf("//") != 0 ){

            arr = input.split(",|:");


        }else{

            String my_ctm = input.substring(input.indexOf("//")+2,input.indexOf("\\n"));

            arr_pre = input.split(Pattern.quote("\\n"));

            for(int i = 0; i<arr_pre.length; i++){

                arr = arr_pre[i].split(Pattern.quote(my_ctm));
            }
        }

        return 0;
    }
}
