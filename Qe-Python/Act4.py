conn=input()
while(conn):
    player1=input("enter the option").strip()
    player2=input("enter the option").strip()
    if(player1=="rock" and player2=="sy"):
        print("player1 wins")
    elif(player1=="paper" and player2=="rock"):
        print("player1 wins")
    elif(player1=="paper" and player2=="sy"):
        print("player2 wins")
    elif(player1==player2):
        print("draw play again")
    print("enter your cond")
    con=input()
    if(con=="true"):
        conn=True
    else:
        conn=False
        
    

        