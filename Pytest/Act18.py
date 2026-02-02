import pandas as pd
data=pd.read_csv("user.csv")
# print(data["Usernames"])
# print(data["passwords"])
# print(data.loc[1,["Usernames","passwords"]])
print(data["Usernames"].sort_values(ascending=True))
print(data["passwords"].sort_values(ascending=False))