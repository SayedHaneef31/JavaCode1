public class dice_logic {
  public static void main(String[] args) {
    int randomNum = (int)(1+(Math.random() * 6));  // Vaise toh ye 0-5 tk ke no. tk hi print krega .....lekin hmne (+1) llga diya hai.....ab ye poora 1 se leke 6 tk no. generate kre ga.
    System.out.println(randomNum);
  }
}
