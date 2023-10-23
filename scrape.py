#/usr/bin/evn/Python3

import json
import requests
import re
from bs4 import BeautifulSoup
from urllib.parse import urljoin 

url = "https://www.tridenttech.edu/catalog2022/Areas%20Of%20Interest/Information%20Technology.html"

r = requests.get(url)

print(r)

soup = BeautifulSoup(r.content, 'html.parser')

s = soup.find('div', id="columnContent")

print(s)
