class Act15:
    def __init__(self,manufactureer,model,make,transmission,color):
        self.manufactureer=manufactureer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accele(self):
        print(self.manufactureer,self.model)
    def stop(self):
        print(f"{self.manufactureer} {self.model} has stopped")
x=Act15("bajaj","b16",2016,"neww","red")
x.accele()
x.stop()