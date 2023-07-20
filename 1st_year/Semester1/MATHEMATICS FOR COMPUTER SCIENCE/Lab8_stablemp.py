t = int(input())

for i in range(t):
    women = list()
    men = list()

    n = int(input())
    for j in range(n):
        l = input().split()
        men.append([int(i) for i in l])
    for j in range(n):
        l = input().split()
        women.append([int(i) for i in l])

    wi = [-1]*n
    mi = [1]*n
    #print("wi", wi)
    #print("mi", mi)

    while -1 in wi:
        for m0 in range(n):
            #print (men [m0] [mi [m0]])
            w0 = men[m0] [mi [m0]] - 1
            if(wi[w0]<0):
                wi[w0] = m0
            else:
                #print ("women",women [w0])
                #print("m0+1",m0+1)
                #print("wi[w0]*", wi[w0])
                p0 = women[w0][1:]. index(wi[w0] + 1)
                pl= women[w0][1:]. index(m0 + 1)
                #print("p0",p0)
                #print("pl",pl)
                if pl<p0: # new man
                    mi[wi[w0]] = mi[wi[w0]] + 1
                    wi[w0] = m0
                elif p0<pl: #same man
                    mi[m0] = mi[m0] + 1

            #print("wi",wi)
            #print("mi",mi)
    for w in range (n):
        print (w + 1,wi[w]+1)

#print ()
#print (women)
#print (men)