# Lab Database

import mysql.connector
my_con = mysql.connector.connect(
    host="remotemysql.com",
    user="bPHiiRCWTe",
    passwd="Ftl2nnrmAp",
    database="bPHiiRCWTe"
)
print('connected!')
cursor = my_con.cursor()

# 1.3
# cursor.execute("SELECT * FROM characters RIGHT JOIN anime ON characters.animeFK = anime.id")
# for x in cursor:
#     if x[0] == 4 or x[0] == 3:
#         id = x
#         print(id, sep=" ")

# 1.4 ส่วนนี้อันตรายทำพลาด Database ระเบิดได้
# เพิ่มอนิเมะลงในตาราง
# anime = "INSERT INTO anime (id, title, numOfVolume) VALUES(%s, %s, %s)"
# valA = (50, 'Code Geass', 50)#กำหนดค่า id, title, numOfVolume
# cursor.execute(anime, valA)#ส่งข้อมูลanimeไปที่ตารางanime

# # เพิ่มชื่อตัวละครลงในตาราง
# characters = "INSERT INTO characters (id, fName, lName, popularity, animeFK) VALUES(%s, %s, %s, %s, %s)"
# valC = (500310, 'Lelouch', 'Britannia', 9999, 50) #กำหนดค่า id, fName, lName, popularity, animeFK
# cursor.execute(characters, valC)#ส่งข้อมูลCharactersไปที่ตารางcharacter

# cursor.execute("SELECT * FROM characters RIGHT JOIN anime ON characters.animeFK = anime.id")
# for x in cursor:
#     if x[0] == 500310:
#         id = x
#         print(id, sep=" ")

# 1.5
# cursor.execute("SELECT * FROM characters RIGHT JOIN anime ON characters.animeFK = anime.id")
# for x in cursor:
#     id = x[0]
#     fName = x[1]
#     lName =x[2]
#     popularity = x[3]
#     tit = x[6]
#     if x[0] == 500310:
#         print(id, fName, lName, popularity, tit, sep=" ")

# printตารางชื่อตัวละคร แกนx
print('\nprinting character names showing only lastname')
cursor.execute("SELECT * FROM characters")
for x in cursor:
    id = x[0]
    print(id, x[2], sep=" ")

# printตารางชื่ออนิเมะ แกนY
print('\nprinting anime names')
cursor.execute("SELECT * FROM anime")
for y in cursor:
    id = y[0]
    print(id, y[1], sep=" ")


cursor.close()
# คำสั่งส่งข้อมูลขึ้น Database อันตรายทำพลาด Database ระเบิดได้
# my_con.commit() 
my_con.close()