package sk.itsovy;

public class Main {
    public static void main(String[] args) {
        SlovakLang x = new SlovakLang();
        x.formatText("tHiS is SenTenCe");
        System.out.println(x.formatText("tHiS is SenTenCe"));
        English y = new English();
        y.translate("pes");
        Mathematics z = new Mathematics();
        z.reverse(123);
        System.out.println(z.isPrime(991));
    }
}
