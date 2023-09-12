package info_ammount.calculate;

public class InfoAmmount {

    int Page; // кількість сторінок
    double nFinal;
    double Charquant; //довжина повідомлення в знаках
    int Mquantity; //Кількість літер у алфавіту
    double log2_m = Math.log(Mquantity) / Math.log(2);
    double Iresult;

    public InfoAmmount(int Page,  double Charquant, int Mquantity) {
        this.Page = Page;
        this.Charquant = Charquant;
        this.Mquantity = Mquantity;
        this.log2_m = Math.log(Mquantity) / Math.log(2);

    }
public double MethodHartli()
{
    nFinal = Page * Charquant;
    return Iresult = nFinal * log2_m;
}

}
