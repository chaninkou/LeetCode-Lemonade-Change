package leetcode860;

public class CheckCorrectChangeFunction {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        
        // For each bill in bills
        for(int bill : bills){
            // We have five dollar change
            if(bill == 5){
                five++;
            } else if (bill == 10){ // Give the 5 dollar back, we got one ten dollar bill back
                five--;
                ten++;
            } else if (ten > 0){ // $20, then give five dollar back and ten dollar back
                ten--;
                five--;
            } else { // $20, if we don't have any ten dollars bill, then we give them 3 five dollars bill
                five = five - 3;
            }
            
            // If five dollar bill is negative which mean there wasn't enough change
            if(five < 0){
                return false;
            }
        }
        return true;
    }
}
