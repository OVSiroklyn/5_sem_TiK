package info_ammount.calculate;

public class InfoAmmount {

   int Charquant; //довжина повідомлення в знаках
    int Mquantity; //Кількість літер у алфавіту
    double log2_m =  (Math.log(Mquantity) / Math.log(2));
    int Iresult;

    public InfoAmmount(int Charquant, int Mquantity)
    {

        this.Charquant = Charquant;
        this.Mquantity = Mquantity;
        this.log2_m =  (Math.log(Mquantity) / Math.log(2));
    }
    public int MethodHartli()
    {
        return  Iresult = (int)( (Charquant) * (int)log2_m);
    }

}
