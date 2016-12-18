s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS"
m,l= [],[]
count = 0
for i in range(0,len(s),3):
    l.append(s[i:i+3])
print l
for i in l:
    if i not in ['SOS']:
        m.append(i)
print m
for i in m:
    h = ','.join(i)
    if h[0] not in ['S']:
        count = count+1
    if h[2] not in ['O']:
        count = count+1
    if h[4] not in ['S']:
        count = count+1
print count
