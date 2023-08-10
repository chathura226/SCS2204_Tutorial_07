object q01 extends App{
  def filterEvenNumbers(listNum:List[Int]):List[Int]={
    listNum.filter(num=>num%2==0)
  }

  val myList=List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
  val result=filterEvenNumbers(myList)
  for(i<-result){
    print(i+" ")
  }
}