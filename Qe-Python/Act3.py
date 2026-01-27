player1=input("enter the option")
player2=input("enter the option")
if(player1=="rock" and player2=="sy"):
    print("player1 wins")
elif(player1=="paper" and player2=="rock"):
    print("player1 wins")
elif(player1=="paper" and player2=="sy"):
    print("player2 wins")
elif(player1==player2):
    print("draw play again")