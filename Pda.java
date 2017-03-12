class Pda {
  private boolean func1(int val){
    if(val == 1){ // was assignment operator, should be == operator
      return true;
    }else{
      return false;
    }
  }

  private int max(int a, int b){ // typo in private (missing e), comma needed between a and b
    if(a > b){
      return a;
    }else{
      return b;
    }
  }

  private int looper(){
    int i = 0;
    while(i < 10){ // should be <10, or it will count to 11 instead
      i++;
    }
      return i; // return i outside the loop or the loop only runs once
  } 

   public String checkLoop(){ // return a string, not void
  if (looper() == 10){ // looper is a function, not a variable, so call it
    return "looper passed"; // missing semicolon at end of line
  }
  else{
    return "looper failed";
  }
  
}
} // missing close bracket