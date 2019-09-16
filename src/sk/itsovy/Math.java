//Name: Kekesiova

package sk.itsovy;

public class Math extends Subject {

    public int reverse(int num){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
        return 0;
    }

}
