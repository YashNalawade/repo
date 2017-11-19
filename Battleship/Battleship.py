
#Modules used
import random
import time


#Function for generating a board
def print_board(board):
    for row in board:
        print " ".join(row)
        
#Function for generating a random row
def random_row(board):
    return random.randint(0, len(board) - 1)

#Function for generating a random column
def random_col(board):
    return random.randint(0, len(board[0]) - 1)

name=raw_input("Enter your name:")

print "\n"
time.sleep(0.6)

print "Hello",name.capitalize(),"time to play battleship."
print "\n"
time.sleep(1.6)
print "INTRODUCTION:"
time.sleep(0.5)
print "Battleship is a classic two person game, originally played with pen and paper on a grid (typically 10x10)."
time.sleep(5)
print "\n"
print "HOW TO PLAY:"
time.sleep(0.5)
print "In this game,a ship is hidden in the grid and the player must guess the correct corresponding row and column to win in game in given number of chances."
time.sleep(8)

print "\n"

print "Let's start"
print "\n"
time.sleep(1)
#The main game function
def main():
    b=True
    while b:
        a = 5
        board = []

        for x in range(0, 5):
            board.append(["O"] * 5)

        ship_row = random_row(board)
        ship_col = random_col(board)
        while a>0:
            print "Number of chances left :",a
            time.sleep(0.6)
            print "\n"
            print_board(board)
            print "\n"
            time.sleep(0.7)
            guess_row = int(raw_input("Guess Row:")) - 1 
            guess_col = int(raw_input("Guess Col:")) - 1

            if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
                print "Oops, that's not even in the ocean."
                a+=1
            elif(board[guess_row][guess_col] == "X"):
                print "You guessed that one already."
                a+=1
        
            elif guess_row == ship_row and guess_col == ship_col:
                print "Congratulations! You sank my battleship!"
                break 
            else:
                print "You missed my battleship!"
                board[guess_row][guess_col] = "X"

            a -= 1
        if a==0:
            print "Oops,that was your last chance!","The ship is in row:",ship_row+1,"and column:",ship_col+1
            print "Game over!"
            time.sleep(1)
            print "\n"
            x=raw_input("Wanna play again Enter y/n : ")
            print "\n"
            if x=="y":
                b=True
                time.sleep(1)
            else:
                b=False
                print "Thanks for playing (^_^)"
        else:
            print "You win !"
            print "Game over!"
            time.sleep(2)
            print "\n"
            x=raw_input("Wanna play again Enter y/n : ")
            print "\n"
            if x=="y":
                b=True
                time.sleep(1)
            else:
                b=False
                print "Thanks for playing ^_^"

main()
