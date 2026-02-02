import pandas as pd
data={
    "FirstName":["satvik","avinash","lahari"],
    "LastName":["shah","kati","rath"],
    "email":["sat@gmail.com","avi@gmail.com","lahari@gmail.com"],
    "phone":[1234,123456,12345678]
}
df=pd.DataFrame(data)
df.to_excel("info.xlsx")
# print(df)
