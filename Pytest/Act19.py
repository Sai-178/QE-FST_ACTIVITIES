import pandas as pd
df=pd.DataFrame([[1.2,10,35],[3,5,8],[2,4,7]],columns=["A","B","C"],index=["X","Y","Z"])
print(df)
df.to_xml("dataa.xml",index=False)
print("successfully created!")