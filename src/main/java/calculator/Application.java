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

        String num = input;

        if(input.indexOf("//") != 0 ){

            arr = input.split(",|:");


        }else{

            String my_ctm = input.substring(input.indexOf("//")+2,input.indexOf("\\n"));

            arr_pre = input.split(Pattern.quote("\\n"));

            num = arr_pre[arr_pre.length - 1];

            if (!num.contains(my_ctm) && num.length() > 1) {
                throw new IllegalArgumentException("커스텀한 구분자가 없습니다.");
            }

            arr = num.split(Pattern.quote(my_ctm));
        }

        return Hap(arr);
    }

    public static int Hap(String[] arr){

        int hap = 0;


        for(int i = 0; i < arr.length; i++){

            int hap_pre = Integer.parseInt(arr[i]);

            if(hap_pre < 0){

                throw new IllegalArgumentException("양수를 입력해 주세요.");
            }

            hap += hap_pre;

        }

        return hap;

    }
}
