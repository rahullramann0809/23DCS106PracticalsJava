#include<iostream>
#define max 5
int front=-1;
int rear=-1;
int queue2[max];
using namespace std;
void enqueue(int x)
{
    if((rear+1)%max==front)
    {
        cout<<"Queue Overflow";
    }
    else if(front==-1 && rear==-1)
    {
        front=rear=0;
        queue2[rear]=x;
    }
    else
    {
        rear=rear+1;
        queue2[rear]=x;
    }
    cout<<"Enqueued Element is"<<queue2[rear]<<endl;
}

void dequeue()
{
    
}