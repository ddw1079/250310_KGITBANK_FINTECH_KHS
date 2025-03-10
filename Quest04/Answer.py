print("---- 화씨온도와 섭씨온도를 바꾸는 프로그램 작성 ----")
print("(1. 화씨온도, 2. 섭씨온도)")
select = input(" - 온도 타입 입력: ")
if (select == "1"):
    print("화씨온도를 섭씨온도로 변환합니다.")
    temper = int(input(" - 화씨 온도 입력: "))
    temperResult = (temper - 32) * 5 / 9
    # 결과 출력하는 코드 필요
elif (select == "2"):
    print("섭씨온도를 화씨온도로 변환합니다.")
    temper = int(input(" - 섭씨 온도 입력: "))
    temperResult = (temper * 9 / 5) + 32
    # 결과 출력하는 코드 필요
else:
    print("잘못 입력하셨습니다.")

print("")

