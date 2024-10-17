#include<iostream>
#define max 5
using namespace std;
int front =-1;
int rear=-1;
int queue1[max];

void enqueue(int x)
{
    if (rear==(max-1))
    {
        cout<<"Queue Overflow\n";
    }
    else if(front==-1 && rear==-1)
    {
        front=rear=0;
        queue1[rear]=x;
    }
    else
    {
        rear=rear+1;
        queue1[rear]=x;
    }
     cout<<"Enqueued Element is:"<<queue1[rear]<<endl;
}

void dequeue()
{
    if(front==-1 && rear==-1)
    {
        cout<<"Queue Underflow\n";
    }
    else if(front==rear)
    {
        cout<<"Dequeued Element is:"<<queue1[front]<<endl;
        front=rear-1;
    }
    else 
    {   cout<<"Dequeued Element is:"<<queue1[front]<<endl;
        front= front+1;
    }
}

void display()
{  int i;
    if(front==-1 && rear==-1)
    {
        cout<<"Queue is empty\n";
    }
    cout<<"The Elements are: ";
    for(i=front;i<=rear;i++)
    {
        cout<<queue1[i]<<"  ";
    }
    cout<<endl;
}

int main()
{
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);
    dequeue();
    display();
    dequeue();
    enqueue(50);
    enqueue(60);
    dequeue();
    dequeue();
    display();

}

