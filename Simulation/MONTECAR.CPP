
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
#include<stdlib.h>

void main()
{
  int gd=DETECT,gm;
  initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
  int r, N, n=0,xr,yr,xc=300,yc=250;

  printf("Enter radius\n");
  scanf("%d",&r);
  printf("Enter valur for N\n");
  scanf("%d",&N);
  circle(xc,yc,r);
  //center line
  line(xc-r,yc,xc+r,yc);
  line(xc,yc-r,xc,yc+r);
  //tangent draw
  line(xc,yc-r,xc+r,yc-r);
  line(xc+r,yc-r,xc+r,yc);



 // putpixel(xc+xr,yc-yr,WHITE);
  for(int i=0;i<N;i++)
  {   //  int n=0;
	setcolor((1+i)%8);
	xr=rand()%r;
	yr=rand()%r;
	line(xc,yc,xc+xr,yc-yr);
	int d=sqrt(pow((xc+xr-xc),2)+pow((yc-yr-yc),2));
       //	printf("%d\n",d);
	if(d<r)
	{
	 // printf("abc\n");
	  n++;

	}

  }
  printf("The value of n is %d\t",n);
  float pi=(4*n)/N;
  printf("\nThe value of pi is %f",pi);
  float value=((3.14-pi)/(3.14))*100;
  float error=abs(value);
  printf("\nError %f\n",error);
  printf("\n Ashutosh Acharya\n 017-311");

 getch();
 closegraph();

}

