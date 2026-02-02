import pandas as pd
data={
    "Usernames":["admin","charles","deku"],
    "passwords":["password","Charl13","AllMight"]
   
}
df=pd.DataFrame(data)
df.to_csv("user.csv",index=False)
print("user.csv file created")

