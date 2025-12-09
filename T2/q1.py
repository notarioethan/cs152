
quotes = [
    "Be the change that you wish to see in the world. ― Mahatma Gandhi",
    "Insanity is doing the same thing, over and over again, but expecting different results. ― Narcotics Anonymous",
    "The man who does not read has no advantage over the man who cannot read. ― Mark Twain",
    "Sometimes the questions are complicated and the answers are simple. ― Dr. Seuss",
    "Do what you can, with what you have, where you are. ― Theodore Roosevelt"
]

def main():
    numList = []
    while True:
        num = int(input("Select a number from 1-5 for a quote."))
        if num >= 1 and num <= 5:
            numList.append(num)
            confirm = input("Continue? (y/n)")
            if confirm == 'n':
                break
            elif confirm == 'y':
                continue
            else:
                print("Invalid input; continuing")
                continue
        else:
            print("Invalid input.")
    for i in numList:
        print(quotes[i - 1])

if __name__ == "__main__":
    main()