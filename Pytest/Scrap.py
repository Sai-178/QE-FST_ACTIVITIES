import requests
from bs4 import BeautifulSoup
response = requests.get("https://www.training-support.net/webelements/tables")
soup = BeautifulSoup(response.content, 'html.parser')
table=soup.find("table")
for row in table.find_all("tr"):
    columns=row.find_all("td")
    row=[i.text for i in columns]
    print(row)