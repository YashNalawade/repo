
# -*- coding: cp1252 -*-( Used for symbol © ) 

#Modules used
import time
import sys

name=raw_input("Enter your name:")

print "\n"
print "Hi",name.title(),"Welcome to Make My Trip©. Make My Trip© provides cheapest fare for travelling around the following cities mentioned below by bus,train and flight."
time.sleep(6)
print "\n"

#Departure and arrival cities available are listed below :
#Ahmedabad, Bangalore, Chennai, Delhi, Hyderabad, Jaipur, Kolkata, Mumbai, Surat, Vadodara

city=["ahmedabad","bangalore","chennai","delhi","hyderabad","jaipur","kolkata","mumbai","surat","vadodara"]

for i in city:
    print i.title(),
time.sleep(3)
print "\n"

#Main function
def main():
    a=True
    while a:
        while True:
            try:
                passengers_adult=int(raw_input("Enter the no. of adults(12+ yrs) for your journey : "))
                print "\n"
                passengers_child= int(raw_input("Enter the no. of children(2-11 yrs) for your journey : "))
                print "\n"
                passengers_infant= int(raw_input("Enter the no. of infant(0-2 yrs) for your journey : "))
                print "\n"
                break
            except ValueError:
                print "Oops!  That was not a valid number.  Try again..."

        dep=raw_input("Enter the depature city : ").lower()
        print "\n"
        arr=raw_input("Enter the arrival city : ").lower()                
        print "\n"
        
        # Go for any of the following mode of transport :
        #        Airplane, Train, Bus

        if dep in city and arr in city:
                    
            if dep==arr:
                print "You have entered the same city for departure and arrival"
                print "\n"
                travel=None
                                
            else:
                while True:
                    try:
                        travel=int(raw_input("How would you like to travel : Enter 1 for Flight 2 for Train 3 for Bus : "))
                        print "\n"
                        
                        #Loop for flight fares
                        if travel==1:
                            convey="flight"
                            choice=int(raw_input("What is your preferred class : Enter 1 for economy,2 for premium economy,3 for business class : "))
                            time.sleep(1)

                            if choice==1:
                                Class='economy'
                                print 'You have entered 1 for economy class.'
                                time.sleep(1.5)
                                a=1
                                
                            elif choice==2:
                                Class='premium economy'
                                print 'You have entered 2 for premium economy class.'
                                time.sleep(1.5)
                                a=1.25
                                
                            elif choice==3: 
                                Class='business'
                                print 'You have entered 3 for business class.'
                                time.sleep(1.5)
                                a=1.50
                                
                            else:
                                raise NameError,'You have enetered an invalid choice'
                                
                            if dep=="ahmedabad":
                                ahd={'bangalore':8000,'chennai':9000,'delhi':5000,'hyderabad':8500,'jaipur':9000,'kolkata':6500,'mumbai':6700,'surat':4500,'vadodara':5300}
                                adult_cost=ahd[arr]
                            elif dep=="bangalore":
                                bng={'ahmedabad':7500,'chennai':6000,'delhi':8500,'hyderabad':8000,'jaipur':5000,'kolkata':5800,'mumbai':9600,'surat':8000,'vadodara':6300}
                                adult_cost=bng[arr]
                            elif dep=="chennai":
                                chn={'ahmedabad':65000,'bangalore':6000,'delhi':9500,'hyderabad':4800,'jaipur':7500,'kolkata':8500,'mumbai':4000,'surat':6400,'vadodara':8800}
                                adult_cost=chn[arr]
                            elif dep=="delhi":
                                dlh={'ahmedabad':4000,'bangalore':8000,'chennai':7200,'hyderabad':4800,'jaipur':9000,'kolkata':8000,'mumbai':6700,'surat':4800,'vadodara':8300}
                                adult_cost=dlh[arr]
                            elif dep=="hyderabad":
                                hyd={'ahmedabad':7000,'bangalore':7800,'chennai':4500,'delhi':7500,'jaipur':8900,'kolkata':9800,'mumbai':3670,'surat':7400,'vadodara':4300}
                                adult_cost=hyd[arr]
                            elif dep=="jaipur":
                                jap={'ahmedabad':6800,'bangalore':8800,'chennai':5200,'delhi':4500,'hyderabad':6000,'kolkata':8000,'mumbai':6700,'surat':4000,'vadodara':7300}
                                adult_cost=jap[arr]
                            elif dep=="kolkata":
                                kol={'ahmedabad':5800,'bangalore':3800,'chennai':6200,'delhi':5500,'hyderabad':8000,'jaipur':4900,'mumbai':5800,'surat':4000,'vadodara':5000}
                                adult_cost=kol[arr]
                            elif dep=="mumbai":
                                mum={'ahmedabad':4500,'bangalore':4000,'chennai':5000,'delhi':6000,'hyderabad':5800,'jaipur':4200,'kolkata':8500,'surat':4000,'vadodara':6300}
                                adult_cost=mum[arr]
                            elif dep=="surat":
                                sur={'ahmedabad':6200,'bangalore':5200,'chennai':7000,'delhi':9500,'hyderabad':7100,'jaipur':8300,'kolkata':6800,'mumbai':6700,'vadodara':5600}
                                adult_cost=sur[arr]
                            elif dep=="vadodara":
                                vad={'ahmedabad':5000,'bangalore':7800,'chennai':6200,'delhi':3000,'hyderabad':5000,'jaipur':4200,'kolkata':4800,'mumbai':5500,'surat':4000}
                                adult_cost=vad[arr]
                            final_cost=adult_cost*a

                        #Loop for train fares    
                        elif travel==2:
                            convey="train"
                            choice=int(raw_input("What is your preferred class.Enter 1 for sleeper,2 for first ac,3 for second ac,4 for third ac : "))
                            time.sleep(1)

                            if choice==1:
                                Class='sleeper'
                                print "You have entered 1 for sleeper class."
                                time.sleep(1.5)
                                a=1
                            elif choice==2:
                                Class='first ac'
                                print "You have entered 2 for first ac."
                                time.sleep(1.5)
                                a=1.75
                                
                            elif choice==3: 
                                Class='second ac'
                                print "You have entered 3 for second ac."
                                time.sleep(1.5)
                                a=1.50
                                
                            elif choice==4:
                                Class='third ac'
                                print "You have entered 4 for third ac."
                                time.sleep(1.5)
                                a=1.25
                                
                            else:
                                raise NameError,'You have enetered an invalid choice'
                              
                            if dep=="ahmedabad":
                                ahd={'bangalore':1200,'chennai':1500,'delhi':1300,'hyderabad':900,'jaipur':1000,'kolkata':1200,'mumbai':800,'surat':600,'vadodara':300}
                                adult_cost=ahd[arr]
                            elif dep=="bangalore":
                                bng={'ahmedabad':1200,'chennai':600,'delhi':1500,'hyderabad':800,'jaipur':1300,'kolkata':900,'mumbai':870,'surat':1000,'vadodara':1200}
                                adult_cost=bng[arr]
                            elif dep=="chennai":
                                chn={'ahmedabad':1500,'bangalore':600,'delhi':2000,'hyderabad':800,'jaipur':1900,'kolkata':1000,'mumbai':900,'surat':1000,'vadodara':1200}
                                adult_cost=chn[arr]
                            elif dep=="delhi":
                                dlh={'ahmedabad':1300,'bangalore':1500,'chennai':2000,'hyderabad':1800,'jaipur':500,'kolkata':950,'mumbai':1200,'surat':1000,'vadodara':900}
                                adult_cost=dlh[arr]
                            elif dep=="hyderabad":
                                hyd={'ahmedabad':900,'bangalore':800,'chennai':800,'delhi':1800,'jaipur':1500,'kolkata':800,'mumbai':670,'surat':900,'vadodara':1000}
                                adult_cost=hyd[arr]
                            elif dep=="jaipur":
                                jap={'ahmedabad':1000,'bangalore':1300,'chennai':1900,'delhi':500,'hyderabad':1500,'kolkata':1000,'mumbai':1070,'surat':1000,'vadodara':900}
                                adult_cost=jap[arr]
                            elif dep=="kolkata":
                                kol={'ahmedabad':1200,'bangalore':900,'chennai':1000,'delhi':950,'hyderabad':800,'jaipur':1000,'mumbai':670,'surat':900,'vadodara':1000}
                                adult_cost=kol[arr]
                            elif dep=="mumbai":
                                mum={'ahmedabad':800,'bangalore':870,'chennai':900,'delhi':1200,'hyderabad':670,'jaipur':1070,'kolkata':670,'surat':400,'vadodara':600}
                                adult_cost=mum[arr]
                            elif dep=="surat":
                                sur={'ahmedabad':600,'bangalore':1000,'chennai':1000,'delhi':100,'hyderabad':900,'jaipur':1000,'kolkata':900,'mumbai':400,'vadodara':300}
                                adult_cost=sur[arr]
                            elif dep=="vadodara":
                                vad={'ahmedabad':300,'bangalore':1200,'chennai':1200,'delhi':900,'hyderabad':1000,'jaipur':900,'kolkata':1000,'mumbai':600,'surat':300}
                                adult_cost=vad[arr]
                            final_cost=adult_cost*a

                        #Loop for bus fares
                        elif travel==3:
                            convey="bus"
                            choice=int(raw_input("What is your preferred class.Enter 1 for sleeper,2 for seating : "))
                            time.sleep(1)
                            
                            if choice==1:
                                Class='sleeper'
                                print "You have entered 1 for sleeper class."
                                time.sleep(1.5)
                                a=1.25

                            elif choice==2:
                                Class='seating'
                                print "You have entered 2 for seating class."
                                time.sleep(1.5)
                                a=1
                                
                            else:
                                raise NameError,'You have enetered an invalid choice'
                              
                            if dep=="ahmedabad":
                                ahd={'bangalore':900,'chennai':1050,'delhi':1000,'hyderabad':700,'jaipur':800,'kolkata':950,'mumbai':500,'surat':350,'vadodara':200}
                                adult_cost=ahd[arr]
                            elif dep=="bangalore":
                                bng={'ahmedabad':900,'chennai':400,'delhi':1080,'hyderabad':620,'jaipur':1000,'kolkata':680,'mumbai':620,'surat':720,'vadodara':900}
                                adult_cost=bng[arr]
                            elif dep=="chennai":
                                chn={'ahmedabad':1050,'bangalore':400,'delhi':1500,'hyderabad':650,'jaipur':1450,'kolkata':750,'mumbai':670,'surat':800,'vadodara':700}
                                adult_cost=chn[arr]
                            elif dep=="delhi":
                                dlh={'ahmedabad':1000,'bangalore':1080,'chennai':1500,'hyderabad':1450,'jaipur':300,'kolkata':700,'mumbai':970,'surat':850,'vadodara':800}
                                adult_cost=dlh[arr]
                            elif dep=="hyderabad":
                                hyd={'ahmedabad':700,'bangalore':620,'chennai':650,'delhi':1450,'jaipur':1100,'kolkata':650,'mumbai':520,'surat':650,'vadodara':750}
                                adult_cost=hyd[arr]
                            elif dep=="jaipur":
                                jap={'ahmedabad':800,'bangalore':1000,'chennai':1450,'delhi':300,'hyderabad':1100,'kolkata':750,'mumbai':520,'surat':750,'vadodara':700}
                                adult_cost=jap[arr]
                            elif dep=="kolkata":
                                kol={'ahmedabad':950,'bangalore':680,'chennai':750,'delhi':700,'hyderabad':650,'jaipur':750,'mumbai':470,'surat':520,'vadodara':600}
                                adult_cost=kol[arr]
                            elif dep=="mumbai":
                                mum={'ahmedabad':500,'bangalore':620,'chennai':670,'delhi':970,'hyderabad':520,'jaipur':520,'kolkata':470,'surat':100,'vadodara':200}
                                adult_cost=mum[arr]
                            elif dep=="surat":
                                sur={'ahmedabad':350,'bangalore':720,'chennai':800,'delhi':850,'hyderabad':650,'jaipur':750,'kolkata':520,'mumbai':100,'vadodara':150}
                                adult_cost=sur[arr]
                            elif dep=="vadodara":
                                vad={'ahmedabad':200,'bangalore':900,'chennai':700,'delhi':800,'hyderabad':750,'jaipur':700,'kolkata':600,'mumbai':200,'surat':150}
                                adult_cost=vad[arr]
                            final_cost=adult_cost*a
                                
                        else:
                            print "You have entered an invalid choice!"
                            print "\n"
                        break
                    
                    except ValueError:
                        print "Oops!  That was not a valid number.  Try again..."
                        print "\n"
        else:
            print "You have entered invalid city."
            print "\n"

        #Functon for calculating cost
        def cost():
            tourism={"ahmedabad":"Akshardham Temple,ISKCON Temple,Sabarmati Ashram","bangalore":"Cubbon Park,Lalbagh Botanical Garden,Bangalore Palace ","chennai":"Marina Beach,Arignar Anna Zoological Park,Elliots Beach","delhi":"Qutub Minar,India Gate,Red Fort","hyderabad":"Charminar,Hussain Sagar,Salar Jung Museum","jaipur":"Hawa Mahal,Jal Mahal,Jantar Mantar","kolkata":"Victoria Memorial,Eden Gardens,Howrah Bridge","mumbai":"Gateway of India,Siddhivinayak Temple,Heritage Buildings","surat":"Dumas Beach,Science Centre,Swaminarayan Temple","vadodara":"Laxmi Vilas Palace,EME Temple,Narmada Canal"}
            places=tourism[arr]
            time.sleep(1)
            print'\n'
            print "Make my trip provides 30% discount on tickets with package.With package you will get following features."
            time.sleep(0.5)
            print '\n'
            print "1)3-Star Hotel with 2 nights stay"
            time.sleep(0.5)
            print '\n'
            print "2)You will get to see the following places."
            time.sleep(0.5)
            print '\n'
            print places
            time.sleep(3)
            print '\n'
            package=raw_input("Do you want a package.Enter y/n : ")
            print '\n'
            child_cost=60/100*final_cost

            if package=="y":
                print "Your total cost from",dep,"to",arr,"by",convey,"in",Class,"class with package would be....."
                packagecost=(40/100*final_cost)+(25/100*child_cost)

            elif package=="n":
                print "Your total cost from",dep,"to",arr,"by",convey,"in",Class,"class without package would be....."
                packagecost=0

            else:
                raise NameError,"You have entered an invalid choice."
            
            totalcost=(passengers_adult*final_cost)+(passengers_child*child_cost)+packagecost
            time.sleep(2)
            print"Rs", totalcost
            time.sleep(1.5)
            print "\n"

        if dep in city and arr in city and travel<=3 and travel>=1:
            cost()            
        again=raw_input("Do you want fare for another ticket.Enter y/n : ")
        print "\n"
        if again=="y":
            a==True
        elif again=="n":
            print "Thankyou for using makemytrip ^_^"
            a=False
            sys.exit()
        else:
            raise NameError,'You have entered an invalid choice.'

main()


