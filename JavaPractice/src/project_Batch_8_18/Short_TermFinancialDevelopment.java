package project_Batch_8_18;

import java.util.Scanner;

public class Short_TermFinancialDevelopment {

    public static void main (String[] args) {

        int day = 18;
        String month = "May";
        zodiac_sign(day, month);
 /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the day you have been born:");
        String day = scan.next();

        System.out.println("Please enter the months you have been born:");
        String month = scan.next();

  */

    }

        static void zodiac_sign(int day, String month){
            String astro_sign="";

            // checks month and date within the
            // valid range of a specified zodiac
            if (month == "December"){

                if (day < 22)
                    astro_sign = "Sagittarius-Your finances could well transform for the better in 2022, Sagittarius. " + "\n" +
                            "And if you’ve been wondering when you’ll ever make it on to the property ladder you might just find your" +"\n" +
                            " luck is in this year. There are changes to your work life and daily routine ahead in 2022, too. " +"\n" +
                            "Think knuckling down, really committing to a plan and pressing pause on your wanderlust for the time being. " +"\n" +
                            "You’re stepping it up in all parts of your life, Sag, and the impact on your finances could be life-changing. " +"\n" +
                            "\n" + "\n" +
                            "Manifest it: A New Year’s resolution or goal is set to come good this year.  \n" +
                            "Make bank: A plan made around the 29 June new moon could create a pleasing passive income stream.\n" +
                            "Don’t be surprised if… Slow and steady wins the money race for Sagittarius in 2022.";
                else
                    astro_sign ="Capricorn-Money has always made the world go round for you, Capricorn, and there should be plenty of " +"\n" +
                            "it coming your way in 2022. There could be plenty of attention headed your way this year, too – " +
                            "whether you like it or not. Your instincts are on fire right now so follow your intuition when it comes " +"\n" +
                            "to contracts, deals and promotions. And don’t accept the first offer – ever! A happy change in personal " +"\n" +
                            "circumstances (the birth of a new project or even a child?) could see you switching things up to create " +"\n" +
                            "a better future this year. Either way, you’ll be in a better position by the end of 2022 than you are " +"\n" +
                            "at the start.\n" + "\n" +
                            "Manifest it: A plan made on the 1 February new moon has money magic written all over it. \n" +
                            "Make bank: A summer windfall or bonus could buy you the freedom you crave. \n" +
                            "Don’t be surprised if… A slow burn investment becomes lucrative this summer. ";
            }

            else if (month == "January"){
                if (day < 20)
                    astro_sign = "Capricorn-Money has always made the world go round for you, Capricorn, and there should be plenty" +"\n" +
                            " of it coming your way in 2022. There could be plenty of attention headed your way this year, too " +"\n" +
                            "– whether you like it or not. Your instincts are on fire right now so follow your intuition when it " +"\n" +
                            "comes to contracts, deals and promotions. And don’t accept the first offer – ever! A happy change in " +"\n" +
                            "personal circumstances (the birth of a new project or even a child?) could see you switching things up " +"\n" +
                            "to create a better future this year. Either way, you’ll be in a better position by the end of 2022 than " +"\n" +
                            "you are at the start.\n" + "\n" +
                            "Manifest it: A plan made on the 1 February new moon has money magic written all over it. \n" +
                            "Make bank: A summer windfall or bonus could buy you the freedom you crave. \n" +
                            "Don’t be surprised if… A slow burn investment becomes lucrative this summer. ";
                else
                    astro_sign = "Aquarius-Brace yourself for your best financial year yet, Aquarius." +
                            " Take it slow as 2022 begins and come up with a plan that prioritises your well-being as well as your" +"\n" +
                            " bank balance, because you’ll be spending big by the end of the year. This is a year to expect more, " +"\n" +
                            "know your worth and ask for what you really deserve. A pay rise, promotion or investment pay off could " +"\n" +
                            "change the way you feel about your future this spring. Ready for a career dream come true? You’ve got " +"\n" +
                            "one coming before the year is out.\n" + "\n" +
                            "Manifest it: Set investment intentions on the 2 March new moon.\n" +
                            "Make bank: Both your career and finances are looking lit this autumn.\n" +
                            "Don’t be surprised if… A status change brings money your way this year.";
            }

            else if (month == "February"){
                if (day < 19)
                    astro_sign = "Aquarius-Brace yourself for your best financial year yet, Aquarius. " +"\n" +
                            "Take it slow as 2022 begins and come up with a plan that prioritises your well-being as well as your " +"\n" +
                            "bank balance, because you’ll be spending big by the end of the year. This is a year to expect more," +"\n" +
                            " know your worth and ask for what you really deserve. A pay rise, promotion or investment pay off " +"\n" +
                            "could change the way you feel about your future this spring. Ready for a career dream come true?" +"\n" +
                            " You’ve got one coming before the year is out.\n" + "\n" +
                            "Manifest it: Set investment intentions on the 2 March new moon.\n" +
                            "Make bank: Both your career and finances are looking lit this autumn.\n" +
                            "Don’t be surprised if… A status change brings money your way this year.";
                else
                    astro_sign = "Pisces-You’ve got luck on your side this year, Pisces, and your finances should feel the" +"\n" +
                            " benefit this summer. Of course, this might mean swapping your lazy vacancy fantasy for digital" +"\n" +
                            " nomad deadlines but we promise the pay off will be worth it. Keep going on a side hustle or passion" +"\n" +
                            " project because magic awaits you if you do. Think dreams come true, well-deserved rewards and " +"\n" +
                            "finally getting the pay off you deserve. Financial success is yours in 2022, Pisces!\n" + "\n" +"\n" +
                            "Manifest it: Make a wish on the 1 April new moon. \n" +
                            "Make bank: Expect a serious cash injection (or the promise of one) this summer. \n" +
                            "Don’t be surprised if… Your biggest money fantasy comes true this year.";
            }

            else if(month == "March"){
                if (day < 21)
                    astro_sign = "Pisces-You’ve got luck on your side this year, Pisces, and your finances should feel the" +"\n" +
                            " benefit this summer. Of course, this might mean swapping your lazy vacancy fantasy for digital" +"\n" +
                            " nomad deadlines but we promise the pay off will be worth it. Keep going on a side hustle or passion" +"\n" +
                            " project because magic awaits you if you do. Think dreams come true, well-deserved rewards and " +"\n" +
                            "finally getting the pay off you deserve. Financial success is yours in 2022, Pisces!\n" + "\n" +
                            "Manifest it: Make a wish on the 1 April new moon. \n" +
                            "Make bank: Expect a serious cash injection (or the promise of one) this summer. \n" +
                            "Don’t be surprised if… Your biggest money fantasy comes true this year.";
                else
                    astro_sign = "Aries-It’s time to get real about your financial future, Aries! " +"\n" +
                            "Act now, think later is practically your life motto but this is not the year for rash decisions. " +"\n" +
                            "What it is, however, is the ideal year to let go of old ideas about what you’re worth. " +"\n" +
                            "It’s time to step into an independent, successful and self-sustaining future, Aries – " +"\n" +
                            "and the stars are aligned for just that. Your cosmic financial axis looks lit in 2022 with " +"\n" +
                            "unexpected windfalls and more than one lucky break on the cards. Put the work in this September" +"\n" +
                            " and you’ll be toasting a big career win by the end of the year. \n" + "\n" +
                            "Manifest it: Set intentions on the 30 April new moon eclipse.\n" +
                            "Make bank: Your luck is in from mid May to late October. \n" +
                            "Don’t be surprised if… Going it alone turns out to be the answer to your financial problems.";
            }
            else if (month == "April"){
                if (day < 20)
                    astro_sign = "Aries-It’s time to get real about your financial future, Aries! " +"\n" +
                            "Act now, think later is practically your life motto but this is not the year for rash decisions. " +"\n" +
                            "What it is, however, is the ideal year to let go of old ideas about what you’re worth. " +"\n" +
                            "It’s time to step into an independent, successful and self-sustaining future, Aries – " +"\n" +
                            "and the stars are aligned for just that. Your cosmic financial axis looks lit in 2022 with" +"\n" +
                            " unexpected windfalls and more than one lucky break on the cards. Put the work in this September" +"\n" +
                            " and you’ll be toasting a big career win by the end of the year. \n" + "\n" +
                            "Manifest it: Set intentions on the 30 April new moon eclipse.\n" +
                            "Make bank: Your luck is in from mid May to late October. \n" +
                            "Don’t be surprised if… Going it alone turns out to be the answer to your financial problems.";
                else
                    astro_sign = "Taurus-Sick of waiting it out till pay day? Ready to live the life of luxury you know " +"\n" +
                            "you deserve? We hear you, Taurus! A major change in your career or job status could provide " +"\n" +
                            "the key to long-term financial stability in 2022. Don’t be afraid to move on, ask for more or " +"\n" +
                            "refuse to be taken for granted as the year plays out. A tricky period over the summer could see " +"\n" +
                            "you hiding in the shadows while the sun shines. Use the time out to get clear about what matters " +"\n" +
                            "most to you and be bold with your next steps. A financial plan or investment made in June could pay " +"\n" +
                            "off in time for Christmas. \n" + "\n" +
                            "Manifest it: Set financial goals on the 30 May new moon.\n" +
                            "Make bank: Expect a big career decision to pay off.\n" +
                            "Don’t be surprised if… You have to speculate to accumulate in 2022.";
            }

            else if (month == "May"){
                if (day < 21)
                    astro_sign = "Taurus-Sick of waiting it out till pay day? Ready to live the life of luxury you know" +"\n" +
                            " you deserve? We hear you, Taurus! A major change in your career or job status could provide " +"\n" +
                            "the key to long-term financial stability in 2022. Don’t be afraid to move on, ask for more or " +"\n" +
                            "refuse to be taken for granted as the year plays out. A tricky period over the summer could see " +"\n" +
                            "you hiding in the shadows while the sun shines. Use the time out to get clear about what matters " +"\n" +
                            "most to you and be bold with your next steps. A financial plan or investment made in June could " +"\n" +
                            "pay off in time for Christmas. \n" + "\n" +
                            "Manifest it: Set financial goals on the 30 May new moon.\n" +
                            "Make bank: Expect a big career decision to pay off.\n" +
                            "Don’t be surprised if… You have to speculate to accumulate in 2022.";
                else
                    astro_sign = "Gemini-Don’t expect a cash bonus to fall into your lap in 2022, Gemini, " +"\n" +
                            "but do know that you can get what you want if you work for it. Your luck is in when it" +"\n" +
                            " comes to career success this year so don’t be surprised if you strike gold with a job" +"\n" +
                            " offer or business proposal. After a dramatic couple of years you’ve learnt to prioritise" +"\n" +
                            " your wellbeing no matter how urgent the work email – stand your ground on that one and you’ll" +"\n" +
                            " go far this year too. This summer could see you on the receiving end of a surprise windfall or" +"\n" +
                            " sealing a thrilling financial deal at work.  " +"\n" +
                            "Manifest it: Think big and then think bigger on the 29 June new moon.\n" +
                            "Make bank: Your cash flow should look healthier by July.\n" +
                            "Don’t be surprised if… You receive a surprise investment in a big idea this summer.";
            }

            else if( month == "June"){
                if (day < 21)
                    astro_sign = "Gemini-Don’t expect a cash bonus to fall into your lap in 2022, Gemini, \" +\n" +
                            " but do know that you can get what you want if you work for it. Your luck is in when it\" +\n" +
                            "comes to career success this year so don’t be surprised if you strike gold with a job\" +\n" +
                            " offer or business proposal. After a dramatic couple of years you’ve learnt to prioritise\" +\n" +
                            " your wellbeing no matter how urgent the work email – stand your ground on that one and you’ll\" +\n" +
                            " go far this year too. This summer could see you on the receiving end of a surprise windfall or\" +\n" +
                            " sealing a thrilling financial deal at work.  \" +\n" +
                            " Manifest it: Think big and then think bigger on the 29 June new moon.\\n\" +\n" +
                            "Make bank: Your cash flow should look healthier by July.\\n\" +\n" +
                            "Don’t be surprised if… You receive a surprise investment in a big idea this summer.\";";
                else
                    astro_sign = "Cancer-Your financial situation is on the up, Cancer, even if it doesn’t feel that way " +"\n" +
                            "right this second! Surprise deals, networking luck and lucrative link ups (#powercouplevibes) " +"\n" +
                            "could all send your bank balance soaring as 2022 hits its stride, but it’s a project you embark " +"\n" +
                            "on solo that holds the key to your financial future. Be brave enough to step into the spotlight " +"\n" +
                            "this year – the results will soon show up in your wallet. Make a career move that promises to pay" +"\n" +
                            " more this summer and you’ll be flying high before the year is out.\n" +
                            "\n" + "Manifest it: Set a ‘sky’s the limit’ money goal on the 28 July new moon.\n" +
                            "Make bank: Expect a February windfall.\n" +
                            "Don’t be surprised if… A new connection offers you a financial leg up in 2022.";
            }

            else if (month == "july"){
                if (day < 23)
                    astro_sign = "Cancer-Your financial situation is on the up, Cancer, even if it doesn’t feel that way " +"\n" +
                            "right this second! Surprise deals, networking luck and lucrative link ups (#powercouplevibes) " +"\n" +
                            "could all send your bank balance soaring as 2022 hits its stride, but it’s a project you embark " +"\n" +
                            "on solo that holds the key to your financial future. Be brave enough to step into the spotlight this year" +"\n" +
                            " – the results will soon show up in your wallet. Make a career move that promises to pay more this summer" +"\n" +
                            " and you’ll be flying high before the year is out.\n" + "\n" +
                            "Manifest it: Set a ‘sky’s the limit’ money goal on the 28 July new moon.\n" +
                            "Make bank: Expect a February windfall.\n" +
                            "Don’t be surprised if… A new connection offers you a financial leg up in 2022.";
                else
                    astro_sign = "Leo-A much-needed cash injection could fall into your lap in 2022, Leo –" +"\n" +
                            " think bonuses, windfalls or an unexpected inheritance. You could even find yourself " +"\n" +
                            "teaming up in love or business with someone whose money flows in all the right directions." +"\n" +
                            " Sounding good? It doesn’t mean you can put your feet up and count your piles of gold just yet. " +"\n" +
                            "You’ve got big career decisions to make in 2022 as you begin to transform every area of your life for good. \n" +
                            "\n" + "Manifest it: Start over with a money plan on the 27 August new moon.\n" +
                            "Make bank: A summer work trip could prove lucrative. \n" +
                            "Don’t be surprised if… It feels like the right time to quit the day job.";
            }

            else if( month == "August"){
                if (day < 23)
                    astro_sign = "Leo-A much-needed cash injection could fall into your lap in 2022, Leo – " +"\n" +
                            "think bonuses, windfalls or an unexpected inheritance. You could even find yourself " +"\n" +
                            "teaming up in love or business with someone whose money flows in all the right directions. " +"\n" +
                            "Sounding good? It doesn’t mean you can put your feet up and count your piles of gold just yet. " +"\n" +
                            "You’ve got big career decisions to make in 2022 as you begin to transform every area of your life for good. \n" +
                            "\n" + "Manifest it: Start over with a money plan on the 27 August new moon.\n" +
                            "Make bank: A summer work trip could prove lucrative. \n" +
                            "Don’t be surprised if… It feels like the right time to quit the day job.";
                else
                    astro_sign = "Virgo-It’s a good job you’re not afraid of hard work, Virgo, " +"\n" +
                            "because the cosmos could turn out to be one hell of a demanding boss in 2022. " +"\n" +
                            "Your big ker-ching moment is coming but you’ll have to put the hours in first. " +"\n" +
                            "There’s no time like the present! Whatever you do, don’t quit a passion project or " +"\n" +
                            "resign a big idea to the scrap heap in 2022. Keep going and your pay off should arrive by autumn. " +"\n" +
                            "Expanding your knowledge or learning a new skill could also prove lucrative this year. " +"\n" +
                            "Save for a rainy day as 2022 begins but don’t be afraid to invest in yourself as the year plays out.\n" +
                            "\n" + "Manifest it: The 25 September new moon is money magic in action for Virgo.\n" +
                            "Make bank: A summer windfall could buy you a magical sense of freedom. \n" +
                            "Don’t be surprised if… You find yourself working harder than ever in 2022.";
            }

            else if (month == "September"){
                if (day < 23)
                    astro_sign = "Virgo-It’s a good job you’re not afraid of hard work, Virgo, " +"\n" +
                            "because the cosmos could turn out to be one hell of a demanding boss in 2022. " +"\n" +
                            "Your big ker-ching moment is coming but you’ll have to put the hours in first. " +"\n" +
                            "There’s no time like the present! Whatever you do, don’t quit a passion project or resign a " +"\n" +
                            "big idea to the scrap heap in 2022. Keep going and your pay off should arrive by autumn. " +"\n" +
                            "Expanding your knowledge or learning a new skill could also prove lucrative this year. " +"\n" +
                            "Save for a rainy day as 2022 begins but don’t be afraid to invest in yourself as the year plays out.\n" +
                            "\n" + "Manifest it: The 25 September new moon is money magic in action for Virgo.\n" +
                            "Make bank: A summer windfall could buy you a magical sense of freedom. \n" +
                            "Don’t be surprised if… You find yourself working harder than ever in 2022.";
                else
                    astro_sign = "Libra-Everything you touch has the potential to turn golden in 2022, " +"\n" +
                            "Libra, so choose a path you can imagine walking in the long term. Time spent on a personal " +"\n" +
                            "project or side hustle could prove your wisest investment this year as the cosmos urges you " +"\n" +
                            "to put your energy where your passion is. Your financial axis is in focus as the year marches on," +"\n" +
                            " inviting you to know your worth and expect more in all areas of your life. You deserve the best, Libra." +"\n" +
                            "Manifest it: Ask the universe for the cash injection you need on the 30 April new moon eclipse.\n" +
                            "Make bank: Your bank balance should look spectacular by November.\n" +
                            "Don’t be surprised if… Doing what you love brings great rewards in 2022.";
            }

            else if (month == "October"){
                if (day < 23)
                    astro_sign = "LibraEverything you touch has the potential to turn golden in 2022, Libra, " +"\n" +
                            "so choose a path you can imagine walking in the long term. Time spent on a personal project " +"\n" +
                            "or side hustle could prove your wisest investment this year as the cosmos urges you to put your " +"\n" +
                            "energy where your passion is. Your financial axis is in focus as the year marches on, " +"\n" +
                            "inviting you to know your worth and expect more in all areas of your life. You deserve the best, Libra." +"\n" +
                            "Manifest it: Ask the universe for the cash injection you need on the 30 April new moon eclipse.\n" +
                            "Make bank: Your bank balance should look spectacular by November.\n" +
                            "Don’t be surprised if… Doing what you love brings great rewards in 2022.";
                else
                    astro_sign = "Scorpio-Building a nest egg or legacy remains a major financial theme for you in 2022, Scorpio." +"\n" +
                            " If your commitment to a savings plan has slipped lately, the start of the year is the ideal time to " +"\n" +
                            "get things back on track. It’s not all sensible bean counting in 2022, though. " +"\n" +
                            "There’s transformational magic in the air for you this year, the kind that could even involve a significant " +"\n" +
                            "– and well paid – spell in the spotlight! A switch up in your daily routine could pay off over the summer " +"\n" +
                            "and good news around the 14 June full moon could see you laughing all the way to the bank.\n" +
                            "\n" + "Manifest it: Set new financial goals on the 23 November new moon.\n" +
                            "Make bank: You should find yourself feeling flush this summer. \n" +
                            "Don’t be surprised if… Good money news comes from unexpected places in 2022.";
            }

            else if (month == "November"){
                if (day < 22)
                    astro_sign = "Scorpio-Building a nest egg or legacy remains a major financial theme for you in 2022, Scorpio. " +"\n" +
                            "If your commitment to a savings plan has slipped lately, the start of the year is the ideal time to get " +"\n" +
                            "things back on track. It’s not all sensible bean counting in 2022, though. There’s transformational magic " +"\n" +
                            "in the air for you this year, the kind that could even involve a significant – and well paid –" +"\n" +
                            " spell in the spotlight! A switch up in your daily routine could pay off over the summer and good news " +"\n" +
                            "around the 14 June full moon could see you laughing all the way to the bank.\n" +
                            "\n" + "Manifest it: Set new financial goals on the 23 November new moon.\n" +
                            "Make bank: You should find yourself feeling flush this summer. \n" +
                            "Don’t be surprised if… Good money news comes from unexpected places in 2022.";
                else
                    astro_sign = "Sagittarius-Your finances could well transform for the better in 2022, Sagittarius. " +"\n" +
                            "And if you’ve been wondering when you’ll ever make it on to the property ladder you might just" +"\n" +
                            " find your luck is in this year. There are changes to your work life and daily routine ahead in 2022, too." +"\n" +
                            " Think knuckling down, really committing to a plan and pressing pause on your wanderlust for the time being. " +"\n" +
                            "You’re stepping it up in all parts of your life, Sag, and the impact on your finances could be life-changing." +"\n" +
                            " \n" + "\n" + "Manifest it: A New Year’s resolution or goal is set to come good this year.  \n" +
                            "Make bank: A plan made around the 29 June new moon could create a pleasing passive income stream.\n" +
                            "Don’t be surprised if… Slow and steady wins the money race for Sagittarius in 2022.";
            }

            System.out.println(astro_sign);
        }


    }


