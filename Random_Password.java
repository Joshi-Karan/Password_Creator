import java.util.*;
/*
    {a-z},{A-Z},{0-9},!,(,),?,[,],_,',~,;,:,@,#,$,%,^,&,*,+,= are allowed in password
 */

class Password {
    void passwordN(int length){
        int startRange = (int) Math.pow(10, length - 1);
        int endRange = (int) Math.pow(10, length) - 1;
        double password = (Math.random() * (endRange - startRange)) + startRange;
        int passwordFinal = (int) password;
        System.out.println("Your password is "+ passwordFinal);
    }
    void passwordA(int length){
        char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
        String res = "";
        for (int i = 0; i < length; i++)
            res = res + alphabetList[(int) (Math.random() * alphabetList.length)];
        System.out.println(res);
    }
    void passwordNA(int length){
        int number = length/2;
        char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
        char[] numberList = {'0','1','2','3','4','5','6','7','8','9'};
        Character[] commonList = new Character[length];
        for(int i = 0 ; i < number ; i++){
            commonList[i] = numberList[((int) (Math.random()*numberList.length))];
        }
        for(int j = number ; j < length ; j++){
            commonList[j] = alphabetList[(int) (Math.random()*alphabetList.length)];
        }
        List<Character> charList = Arrays.asList(commonList);
        Collections.shuffle(charList);
        charList.toArray(commonList);
        for(char elements : commonList){
            System.out.print(elements);
        }
    }
    void passwordNAS(int length){
        char[] symbolsList = {'!','(',')','?','[',']','_','\'','~',';',':','@','#','$','%','^','&','*','+','='};
        char[] alphabetList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
        char[] numberList = {'0','1','2','3','4','5','6','7','8','9'};
        int symbolsLength; int alphabetsLength;
        if(length%3==0){
            symbolsLength = length/3;
            alphabetsLength = length/3;
            Character[] commonList = new Character[length];
            for(int i = 0; i < symbolsLength ; i++){
                commonList[i] = symbolsList[((int) (Math.random()*symbolsList.length))];
            }
            for(int j = symbolsLength ; j < alphabetsLength+symbolsLength ; j++){
                commonList[j] = alphabetList[(int) (Math.random()*alphabetList.length)];
            }
            for(int j = alphabetsLength+symbolsLength ; j < length ; j++){
                commonList[j] = numberList[(int) (Math.random()*numberList.length)];
            }
            List<Character> charList = Arrays.asList(commonList);
            Collections.shuffle(charList);
            charList.toArray(commonList);
            for(char elements : commonList){
                System.out.print(elements);
            }
        }
        else if(length%3==1){
            symbolsLength = length/3;
            alphabetsLength = length/3 + 1;
            Character[] commonList = new Character[length];
            for(int i = 0; i < symbolsLength ; i++){
                commonList[i] = symbolsList[((int) (Math.random()*symbolsList.length))];
            }
            for(int j = symbolsLength ; j < alphabetsLength+symbolsLength ; j++){
                commonList[j] = alphabetList[(int) (Math.random()*alphabetList.length)];
            }
            for(int j = alphabetsLength+symbolsLength ; j < length ; j++){
                commonList[j] = numberList[(int) (Math.random()*numberList.length)];
            }
            List<Character> charList = Arrays.asList(commonList);
            Collections.shuffle(charList);
            charList.toArray(commonList);
            for(char elements : commonList){
                System.out.print(elements);
            }
        }
        else if(length%3==2){
            symbolsLength = length/3;
            alphabetsLength = length/3 + 2;
            Character[] commonList = new Character[length];
            for(int i = 0; i < symbolsLength ; i++){
                commonList[i] = symbolsList[((int) (Math.random()*symbolsList.length))];
            }
            for(int j = symbolsLength ; j < alphabetsLength+symbolsLength ; j++){
                commonList[j] = alphabetList[(int) (Math.random()*alphabetList.length)];
            }
            for(int j = alphabetsLength+symbolsLength ; j < length ; j++){
                commonList[j] = numberList[(int) (Math.random()*numberList.length)];
            }
            List<Character> charList = Arrays.asList(commonList);
            Collections.shuffle(charList);
            charList.toArray(commonList);
            for(char elements : commonList){
                System.out.print(elements);
            }
        }
    }
}

public class Random_Password {
    public static void main(String[] args) {
        Password password = new Password();
        Scanner scan = new Scanner(System.in);
        System.out.println("How Big password do you need?");
        try {
            int passwordLength = scan.nextInt();
            System.out.println("What type of password do you need");
            System.out.println("Type 1, 2, 3, 4 for your options");
            System.out.println("1. Numbers only");
            System.out.println("2. Alphabets only");
            System.out.println("3. Numbers + Alphabets");
            System.out.println("4. Numbers + Alphabets + Symbols");
            int option1 = scan.nextInt();
            switch (option1) {
                case 1 -> password.passwordN(passwordLength);
                case 2 -> password.passwordA(passwordLength);
                case 3 -> password.passwordNA(passwordLength);
                case 4 -> password.passwordNAS(passwordLength);
            }
        }
        catch (Exception e){
            System.out.println("Error Run the program again");
        }
    }
}

