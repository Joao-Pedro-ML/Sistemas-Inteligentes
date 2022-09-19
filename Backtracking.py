
from os import remove


def Busca_retrocesso(G, inicial):
    LE=[inicial]
    LNE=[inicial]
    BSS=[]
    EC = inicial
    while LNE != []:
        if EC == Objetivo:
            return LE #Se houver sucesso, retorna a lista de estados no caminho
        if EC == [semFilho]:
            while LE != [] & EC == LE[1]:
                BSS = EC
                remove(LE, 1)
                remove(LNE, 1)
                EC = LNE[1]
                LE = EC
        else:
            LNE = EC #Somente os filhos, exceto os ja em BSS, LE ou LNE
            EC = LNE[1]
            LE = EC
        return 9999999
