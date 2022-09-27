public class Main {

    public static void main(String[] args) {
        //Classlar referans type dır
        CustomerManager customerManager =new CustomerManager();//** new burada silikleşti geçersiz kaldı
        CustomerManager customerManager2 =new CustomerManager();
        customerManager = customerManager2; //**burayı yazınca
        customerManager.Add();
        customerManager.Remove();
        customerManager.Uptade();

        //Value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 =30;
        System.out.println(sayi2);//10 olur.

        int[]sayilar1 = new int[]{1,2,3};
        int[]sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }


}
