package calculator;

import java.util.regex.Pattern;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {

    public static void inputException(String input){

        if(!input.matches("[0-100,:/{2}\\n]+")){

            throw new IllegalArgumentException("잘못 입력하셨습니다.");
        }
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = readLine();

        int result = Change(input);

        inputException(input);
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

        return Hap(arr);
    }

    public static int Hap(String[] arr){

        int hap = 0;


        for(int i = 0; i < arr.length; i++){

            hap += Integer.parseInt(arr[i]);

            if (hap < 0) {
                throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
            }

        }

        return hap;

    }
}
