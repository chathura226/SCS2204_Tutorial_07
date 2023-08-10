object q02 extends App{
  def calculateSquare(myList:List[Int]):List[Int]={
    myList.map(x=>x*x)
  }

  val myList=List(1,2,3,4,5,6,7,8,9,10)
  print("My List: ")
  for (i <- myList) {
    print(i + " ")
  }

  val result=calculateSquare(myList)
  print("\nCorresponding Squares : ")
  for(i<-result){
    print(i+" ")
  }
}