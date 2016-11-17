public String frontTimes(String str, int n) {
  String res ="";
  String fnttimes="";
  if(str.length()>=3){
  res=str.substring(0,3);
  }
  if(str.length()<3) {
  res =str;
  }
  for(int i =0;i<n;i++){
  fnttimes=fnttimes+res;
  }
  return fnttimes;
}
