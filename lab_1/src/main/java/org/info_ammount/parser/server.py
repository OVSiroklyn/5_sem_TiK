import sys
import requests
from bs4 import BeautifulSoup
"""
    Функция для получения текста с веб-страницы.
"""
def get_page_text(url):
    response = requests.get(url)
    response.encoding = 'utf-8'  # Set encoding here
    soup = BeautifulSoup(response.content, 'html.parser')
    text = soup.get_text()
    return text

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python server.py <url>")
        sys.exit(1)

    url = sys.argv[1]
    page_text = get_page_text(url)
    print(page_text.encode('utf-8').decode('utf-8'))
