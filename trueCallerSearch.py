from truecallerpy import bulk_search
from time import sleep

timeout = 1

Name = "Amit Sharma"

async def check(data):
    # sleep(30)
    result = await bulk_search(data,"IN", id)
    while(result.get("errorCode",0)==429):
        result = bulk_search(data,"IN", id)
        sleep(timeout)
    for details in result.get('data',[]):
        if(details['value'].get('name',"")==Name):
            print(details['key'])


num_arr=['0','1','2','3','4','5','6','7','8','9']

id = "a1i0d--gBCyudFM-M-nPVLbGLotWBXcjsiL8LPeRCQewH8sIn5WKAp6NS6quPNMm"

first_num = ['7','8','9','6']

data=""

async def main():
    for first in first_num:
        for a in num_arr:
            for b in num_arr:
                for c in num_arr:
                    for d in num_arr:
                        for e in num_arr:
                            for f in num_arr:
                                for g in num_arr:
                                    data += "+91"+first+a+b+c+d+e+f+g+"74,"
                                data=data[:-1]
                                await check(data)
                                data=""

main()

# print(x)
# ==> search_phonenumber("+12093031250","IN", id)