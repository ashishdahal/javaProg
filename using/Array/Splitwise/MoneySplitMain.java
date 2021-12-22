package using.Array.Splitwise;

import java.util.Scanner;

public class MoneySplitMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------Data Entry Section------------------------");
        System.out.println("Enter the total bill");
        int total = sc.nextInt();
        System.out.println("How many participants are there");
        int participants= sc.nextInt();
        int each=total/participants;

        int[] SpentArray = new int[participants];
        int[] AmountToBePaid = new int[participants];
        int[] IndividualPayback = new int[participants];
        int[] totalPaid = new int[participants];
        String[] PaybackNames = new String[participants];



        for(int i=0;i<participants;i++){

            System.out.println("Enter participant name: ");
            String name = sc.next();
            System.out.println("Enter amount spent: ");
            SpentArray[i] = sc.nextInt();
            totalPaid[i]=SpentArray[i];
            System.out.println("---------------NOTICE BOARD-------------------------");
            if(SpentArray[i]>each) {
                IndividualPayback[i]=(SpentArray[i]-each);
                PaybackNames[i]=name;
                System.out.println(name+" still has to get back :"+IndividualPayback[i]+" from the App");
            }else if(SpentArray[i]<each){
                AmountToBePaid[i] = each-SpentArray[i];
                System.out.println(name+" still has to pay :"+AmountToBePaid[i]+" out of "+each+" per head");
                System.out.println("Therefore "+name+" pays "+AmountToBePaid[i]+" to the App");
            }else{
                System.out.println(name+" has a balanced account.");
            }
           // System.out.println("-------------------------------------------");
            MoneySplit ob = new MoneySplit(total,name,SpentArray,AmountToBePaid);
            ob.Display(AmountToBePaid,IndividualPayback,PaybackNames,totalPaid);

        }


}
}
