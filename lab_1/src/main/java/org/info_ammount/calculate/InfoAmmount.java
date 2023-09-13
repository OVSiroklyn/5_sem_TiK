package org.info_ammount.calculate;
public class InfoAmmount {

    int Charquant; //довжина повідомлення в знаках
    String Beginstr; //вхідна строка
    int Mquantity; //Кількість літер у алфавіту
    double log2_m;
    int Iresult;

    public InfoAmmount(String str, int Mquantity)
    {
        this.Charquant = 0;
        this.Beginstr = str;
        this.Mquantity = Mquantity;
        for(int i = 0; i < str.length(); i++)
        {
            this.Charquant++;
        }

        this.log2_m =  (Math.log(Mquantity) / Math.log(2));
    }
    public int MethodHartli()
    {
        return  Iresult = ( (Charquant) * (int)log2_m);
    }

}
