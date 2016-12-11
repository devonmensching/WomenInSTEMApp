package com.dm.user.womeninstem.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dm.user.womeninstem.Database.Counter;
import com.dm.user.womeninstem.Database.DBOperations;
import com.dm.user.womeninstem.Database.Women;
import com.dm.user.womeninstem.R;
import com.dm.user.womeninstem.alarm.AlarmReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // update the database
        updateDB();
    }

    public void onMenukButtonClick(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void updateDB(){
        DBOperations dbOperations = new DBOperations(this);
        if(dbOperations.isWomenEmpty()){
            Women w1 = new Women(1, "Grace Hopper", "Grace Hopper served in the United States’ Navy. Additionally, she was a computer scientist. She invented the first compiler for programming languages. Her work led to the development of the first high level programming language, COBOL.");
            Women w2 = new Women(2, "Mae Jeminson", "Mae Jeminson is an astronaut, educator, and doctor. She was the first African-American women in space. Additionally, she created her own technology consulting firm. Her discoveries will help to get human life to the next solar system in 100 years.");
            Women w3 = new Women(3, "Hypatia", "Hypatia was an astronomer, mathematician, and philosopher.  She was born in Egypt in 350 CE. She is one of the first recorded mathematicians. Additionally, she was a well-respected science teacher. ");
            Women w4 = new Women(4, "Jane Goodall", "Jane Goodall is a primatologist, ethologist, and anthropologist. She lived amongst a group of chimpanzees in Africa. During this time, she was able to document behaviors that had never been seen before. Her research demonstrated the similarities between chimpanzees and humans.");
            Women w5 = new Women(5, "Lillian Gilbreth", "Lillian Gilbreth was a psychologist and industrial engineer. She developed tools that allowed housewives domestic jobs to be done in half the time. This freed up more time for women to pursue other interests. We now use many of her inventions in our daily lives.");
            Women w6 = new Women(6, "Elizabeth Blackwell", "Elizabeth Blackwell was a doctor. She was the first women to attend medical school in the United States. Additionally, she was the first women on the UK medicine register. She dedicated her life to promoting education of women in medicine.");
            Women w7 = new Women(7, "Nettie Stevens", "Nettie Stevens was a geneticist. She discovered the XY sex-determination system. More specially, she found that male beetles produced two kinds of sperm. This lead the the discovery of the x and y chromosomes.");
            Women w8 = new Women(8, "Maryam Mirzakhani", "Maryam Mirzakhani is a mathematician. She received the Fields Medal for her work in mathematics. Her creative ways of thinking about problems has solved some of the world’s unsolved problems. For example, she created a simulation that involved an environment without friction. This led to discoveries in geometry, physics and quantum theory.");
            Women w9 = new Women(9, "Maria Sibylla Merian", "Maria Sibylla Merian was a scientific illustrator and entomologist.  She used her passion for insects and drawing to publish a book on metamorphosis in the 1600s.  Additionally, she discovered new insects in the rainforests in South America. Her drawings are still being used to educate people today.");
            Women w10 = new Women(10, "Florence Bascom", "Florence Bascom was a geologist and educator. She was the second women in the United States to receive a Ph. D in geology, and the first women hired by the United States Geological Survey. Her discoveries lead to a better understanding of earth’s evolution.");
            Women w11 = new Women(11, "Jane Cooke Wright", "Jane Cooke Wright was an oncologist. She led a cancer research center at the age of 33. Her research developed techniques that allowed for more effective cancer treatment. Her discoveries are still being acknowledged today.");
            Women w12 = new Women(12, "Ada Lovelace", "Ada Lovelace was a mathematician and writer. She worked on an early general-purpose computer. She developed the first algorithm to run on the machine. She is now considered to be the first computer programmer.");
            Women w13 = new Women(13, "Sylvia Earle", "Sylvia Earle is a biologist, explorer and aquanaut. She was the first women to dive out of a lockout chamber in a submerged submarine. Additionally, she has broken the depth record for the untethered dive. Her work has help to keep the ocean protected.");
            Women w14 = new Women(14, "Vera Rubin", "Vera Rubin is an astronomer. She discovered the galaxy’s rotation rates. Her research led to the theory of dark matter. Her discoveries are still contributing to scientific research today.");
            Women w15 = new Women(15, "Jocelyn Bell Burnell", "Jocelyn Bell Burnell is an astrophysicist. She discovered the first radio pulsars. This proved that elements come exploding stars. Additionally, she was one of the only female physics professors in the UK.");
            Women w16 = new Women(16, "May-Britt Moser", "May-Britt Moser is a psychologist and neuroscientist. She discovered a new type of nerve cells, called grid cells. These cells create maps like a GPS in our brains. They are important to our memory. This important discovery has allowed us to better understand diseases of the brain, such as Alzheimer’s.");
            Women w17 = new Women(17, "Wang Zhenyi", "Wang Zhenyi was an astronomer, poet and mathematician. She is known as one of the greatest minds of China’s Qing dynasty. She wrote theories on why the moon blocked our view from the sun during an eclipse. Her theories were proven to be true after her death, and are used today.");
            Women w18 = new Women(18, "Marie Curie", "Marie Curie was a physicist and chemist. She discovered two new radioactive elements, polonium and radium. Her discoveries lead to the invention of the x-ray machine.");
            Women w19 = new Women(19, "Hertha Ayrton", "Hertha Ayrton was an engineer, mathematician, and inventor. She invented a quiet bright light. She later published a paper on her invention, which lead to much of her success. She was awarded the Hughes Medal by the Royal Society.");
            Women w20 = new Women(20, "Lisa Meitner", "Lisa Meitner was a physicist. She discovered nuclear fission. Her research was awarded a Nobel Prize. Although it was not directly awarded to her, she won other awards for her work.");
            Women w21 = new Women(21, "Rosalyn Yalow", "Rosalyn Yalow is a medical physicist. She created a way to measure hormones in the human body. Her research lead to discoveries on insulin. After publishing 60 research articles in four years, she was awarded the Nobel Prize.");
            Women w22 = new Women(22, "Sau Lan Wu", "Sau Lan Wu is a particle physicist. She was born in Japan, and earned her PhD at Harvard University. Her research helped to discover an elementary particle called charm quark. Later, she then discovered another particle called gluon. Her ground-breaking discoveries has made her one of the most successful physicists in her field.");
            Women w23 = new Women(23, "Mary Anning", "Mary Anning was a fossil collector and paleontologist. She proved extinction was real in the 1800s. At a young age, she found dinosaur skeletons. Years later, she proved the skeletons belonged to an animal that no longer existed. Thus, proving extinction.");
            Women w24 = new Women(24, "Karen Horney", "Karen Horney was psychoanalyst. She questioned many of Freud’s views.  For example, she discovered that anxiety is shaped by the environment we grow up in. This directly constricted Freud. Her work created new ways of thinking.");
            Women w25 = new Women(25, "Rosalind Franklin", "Rosalind Franklin was a chemist and x-ray crystallographer. Her work contributed to discoveries on the molecular structures of DNA, RNA, viruses, coal and graphite. Her work had not be recognized until after her death, but it is still used today.");
            Women w26 = new Women(26, "Patricia Bath", "Patricia Bath is an ophthalmologist and an inventor. She discovered that African Americans were more prone to eye-sight problems, such as glaucoma. Additionally, she started the first community outreach volunteer-based eye-care program and founded the American Institute for the Prevention of Blindness. Her accomplishments have helped many.");
            Women w27 = new Women(27, "Christiane Nusslein-Volhard", "Christiane Nusslein-Volhard is a biologist. She won the Albert Lasker Award for Basic Medical Research and the Nobel Prize. She discovered which genes were involved in embryo’s pattern formation. This lead to the discovery of evolution.");
            Women w28 = new Women(28, "Valentina Tereshkova", "Valentina Tereshkova is an engineer and cosmonaut. She was the first women in space. She flew on a solo spaceship called Vostok VI for the USSR. Her bravery and success is still admired today.");
            Women w29 = new Women(29, "Elizabeth Blackburn", "Elizabeth Blackburn is a molecular biologist. She discovered a special kind of DNA called telomeres. Later she found that the telomeres had a protective cap that wore off over time. This lead to discoveries on diseases, such as cancer, organ failure and Alzheimer’s.");
            Women w30 = new Women(30, "Katia Krafft", "Katia Krafft was a geologist and volcanologist. Unlike other volcanologist, Krafft was not afraid of observing volcanic eruptions in person. Her bravery lead to discoveries on formation of volcanos, acid rain, and ash clouds. ");
            Women w31 = new Women(31, "Mary Agnes Chase", "Mary Agnes Chase was a botanist and suffragist. She was a full-time illustrator for the United States Department of Agriculture. She discovered that grasses were the best way to feed livestock. Additionally, we fought for women’s right to vote.");
            dbOperations.addWomen(w1);
            dbOperations.addWomen(w2);
            dbOperations.addWomen(w3);
            dbOperations.addWomen(w4);
            dbOperations.addWomen(w5);
            dbOperations.addWomen(w6);
            dbOperations.addWomen(w7);
            dbOperations.addWomen(w8);
            dbOperations.addWomen(w9);
            dbOperations.addWomen(w10);
            dbOperations.addWomen(w11);
            dbOperations.addWomen(w12);
            dbOperations.addWomen(w13);
            dbOperations.addWomen(w14);
            dbOperations.addWomen(w15);
            dbOperations.addWomen(w16);
            dbOperations.addWomen(w17);
            dbOperations.addWomen(w18);
            dbOperations.addWomen(w19);
            dbOperations.addWomen(w20);
            dbOperations.addWomen(w21);
            dbOperations.addWomen(w22);
            dbOperations.addWomen(w23);
            dbOperations.addWomen(w24);
            dbOperations.addWomen(w25);
            dbOperations.addWomen(w26);
            dbOperations.addWomen(w27);
            dbOperations.addWomen(w28);
            dbOperations.addWomen(w29);
            dbOperations.addWomen(w30);
            dbOperations.addWomen(w31);
        }
        if (dbOperations.isCounterEmpty()) {
            // set alarms
            AlarmReceiver alarmReceiver = new AlarmReceiver();
            alarmReceiver.SetAlarm(this);

            Counter counter = new Counter(1, 1, 1, 7, 1);
            dbOperations.addCounter(counter);
        }

    }

}
