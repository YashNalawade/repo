#!/bin/python3
from turtle import *
from random import randint

speed(10)
penup()
goto(-140,140)

for i in range(1,16):
  write(i,align='center')
  right(90)
  forward(10)
  pendown()
  forward(150)
  penup()
  backward(160)
  left(90)
  forward(20)
  
  
t1=Turtle()
t1.color('red')
t1.shape('turtle')
t1.penup()
t1.goto(-160,100)
for i in range (10):
  t1.right(36)
t1.pendown()
  
t2=Turtle()
t2.color('blue')
t2.shape('turtle')
t2.penup()
t2.goto(-160,70)
for i in range (10):
  t2.right(36)
t2.pendown()

t3=Turtle()
t3.color('tomato')
t3.shape('turtle')
t3.penup()
t3.goto(-160,40)
for i in range (10):
  t3.right(36)
t3.pendown()

t4=Turtle()
t4.color('magenta')
t4.shape('turtle')
t4.penup()
t4.goto(-160,0)
for i in range (10):
  t4.right(36)
t4.pendown()


for i in range(95):
  t1.forward(randint(1,5))
  t2.forward(randint(1,5))
  t3.forward(randint(1,5))
  t4.forward(randint(1,5))
