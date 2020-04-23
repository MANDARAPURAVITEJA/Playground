#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  b=a%4;
  if(a%100==0)
  { if(a%400==0)
    std::cout<<"Vicky can celebrate his birthday.";
    else
      std::cout<<"Vicky can't celebrate.";
	}
  else
  {
    if(a%4==0)
      std::cout<<"Vicky can celebrate his birthday.";
    else
      std::cout<<"Vicky can't celebrate.";
  }
}