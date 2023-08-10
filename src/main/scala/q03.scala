object q03 extends App{
  def isPrime(n:Int):Boolean={
    if(n==0 || n==1) return false
    else for(i<-2 to n/2){
      if(n%i==0) return false
    }
    true
  }
  def filterPrime(myList:List[Int]):List[Int]={
    myList.filter(num=>isPrime(num))
  }

  val myList=List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
  val result=filterPrime(myList)
  for(i<-result){
    print(i+" ")
  }
}