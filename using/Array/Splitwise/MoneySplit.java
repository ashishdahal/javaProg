package using.Array.Splitwise;

import java.util.stream.IntStream;

public class MoneySplit {

   int total;
   String name;
   int[] SpentArray;
   int[] AmountToBePaid;


    public MoneySplit(int total, String name, int[] SpentArray, int[] AmountToBePaid){


        this.total=total;
        this.name=name;
        this.SpentArray=SpentArray;
        this.AmountToBePaid=AmountToBePaid;

    }

    public void Display(int[] amountToBePaid, int[] individualPayback, String[] paybackNames, int[] totalPaid) {

        int sum = IntStream.of(AmountToBePaid).sum();
        int totalPaidSum = IntStream.of(totalPaid).sum();
        System.out.println("Total Paid Sum: "+totalPaidSum);
        System.out.println("The Total amount in the App :" + sum);

            if(totalPaidSum==this.total) {

                for (int i = 0; i < individualPayback.length; i++) {

                    if (individualPayback[i] > 0 && sum > individualPayback[i]) {
                        System.out.println(paybackNames[i] + " gets back " + individualPayback[i] + " from the App");

                    }

                }
            }else if(totalPaidSum<this.total){
                System.out.println("Not Enough money paid towards bill");
                System.out.println("-------------------------------------");
            }else{
                System.out.println("Too much money went to the bill");
            }




        //System.out.println("The amount in the app:"+ Arrays.toString(AmountToBePaid));

    }

    }





