from matplotlib import font_manager, rc, rcParams

#한글 깨짐을 방지하기 위한 셋팅
font="C:\Windows\Fonts\H2GTRM.TTF"
font_text = font_manager.FontProperties(fname=font).get_name()
rc("font",family=font_text)

#그래프에서 마이너스 값을 표현
rcParams["axes.unicode_minus"] = False