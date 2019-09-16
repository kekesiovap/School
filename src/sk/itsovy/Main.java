package sk.itsovy;

public class Main {
    public static void main(String[] args) {
        SlovakLang x = new SlovakLang();
        x.formatText("tHiS is SenTenCe");
        System.out.println(x.formatText("tHiS is SenTenCe"));
        English y = new English();
        y.translate("pes");
        Math z = new Math();
        z.reverse(123);
    }
}
