package fr.jobslake;

import ch.qos.logback.classic.Logger;
import fr.jobslake.similarity.Pos;
import javafx.scene.paint.Stop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;

public class DataSimilarityTest {

    public static void main(String[] args) throws IOException {

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger rootLoggerMongo = loggerContext.getLogger("org.mongodb.driver");
        rootLoggerMongo.setLevel(Level.OFF);
        Logger rootLoggerDeep = loggerContext.getLogger("org.deeplearning4j.models");
        rootLoggerDeep.setLevel(Level.OFF);

        Pos posSimilarityObject = new Pos();
        System.out.println("pos object instanciated");
        ArrayList<String> experienceDescription = new ArrayList<String>();
        //// Bi profiles
        experienceDescription.add("- Develop Business Intelligence solutions for Marketing (website conversions, tracking, attribution), Finance (Income reconciliation from Salesforce data, Usage Cost, AR), CRM (Email Campaign performance)and School Usage using Qlikview, QlikSense, NPrinting, Power BI, SQL, MS SQL Server, SSRS, SSIS, Excel, R, Google Adwords, Salesforce. - Build automation framework for several reports, reduced processing time in general - Develop numerous ad-hoc queries and reports to collect and present information that satisfied clients and contributed to achieve organizational goals.  - Train various business unit teamson the effective use of processes, tools, and resources");
        experienceDescription.add("- Create reports using Business Objects with aim of improving the business - Create bespoke Business Intelligence solutions for the business - Performance reporting  #Achievements: Created a Business Intelligence system with MS Access that calculated the best new housing patches based on scoring for different weighting elements. I received a bonus for the creation of this system");
        experienceDescription.add("Creation of a Data Warehouse: - Marketing & Finance Data Mart. - Designed the ETL using SSIS using Kimball design methodology and optimizing the Data Warehouse loading time (the legacy Data Warehouse was taking 2 hours every nights and the current one that I have designed from scratch takes less than 20 minutes and is being refreshed every hours). - Creation of SSAS cubes to feed Dashboards for the Marketing & Finance Senior Management Team. - Creation of Marketing Dashboard using SSRS and other marketing experience reports (Enquiry/Lead conversion) using MDX, etc.  Various reports such as: - Agreed Work Load By Fee Earners for the PI Client Intake Commitee. - Report Audit: List of the reports sorted by the frequency that they are being used and by who. - Created a SSIS package including a C# component that scan the Active Directory Tree and then create an Active Directory Database. The goal is to monitor the different level of authorisation each employee get allocated by the different I.T team in the UK. Modeling the outcome of our Marketing campaigns in terms using Data mining algorithms (using R) as well as providing various analysis on the variance of several metrics (such as the length of time it takes for matters to be opened, to become profitable, etc).  Optimization: - Optimizing Dashboard stored procedures using various indexing strategies as well as dynamical sql to control the use of the query plan cache. - Optimizing the loading of the DataWarehouse by exploiting parallel processing in SSIS and other various techniques (rewriting the package avoiding the use of lookups, etc).");
        experienceDescription.add("My main role was to deal with the data migration projects. I was in charge of Migrating Data from legacy applications (legal account software such as Opsis, Osprey, Quill, SOS, Axxia, AlphaLaw, AIM, etc) into our legal account software (DPS Software). Here were my main activities: *Collect and analyse the project’s business requirements with the stakeholders *Create process to extract, transform and load (ETL) data from legacy systems using SSIS. *Investigate and rectify technical issues within the ETL process. *Interact with internal and external teams to troubleshoot any issue in data migration cycle. *Create and maintain technical documentation  My second role was to develop Business Intelligence services. I was working on a variety of greenfield projects for my firm as well as for our clients. My main activities: *MS BI Stack - SSIS , SSRS *Develop new BI services *Responsible for developing all the SSRS reports and dashboards (bespoke as well as the one that get included into our legal account software) *When required I assist the Software Developers in writing T-SQL (Stored Procedures, Functions, Triggers, etc) *Develop data warehouse to allow to create reports for the system engineers or the sales team. ");
        experienceDescription.add("Designing and implementing systems that provide for the quality assurance of the company`s information and data. Business Intelligence endorsements for Business Intelligence systems implementation, working with the Head of Business Intelligence and relevant stakeholders for each business area. Working with the Business Systems team to define and implement data backup and security of information assets. Providing integral support when implementing new systems, preparing user training material and technical documentation.");

        // DE profiles
        experienceDescription.add("The Big Data Engineer programme is a technical journey where I acquire through deep learning methodologies, knowledge and hands-on skills that will allow me to be productive within the business environment.  Courses and Accreditation  - Professional skills - Web applications and coding - GIT, GITHUB and Agile - Introduction to data analytics - Data modelling principles - SQL and T-SQL - Python and data munging techniques - NoSQL using MongoDB and Neo4j - Cloudera Hadoop Ecosystem including Sqoop, Pig & Flume - Apache Spark - Python  Accreditation - Cloudera CCA Developer - CISI IOC (Investment & Securities) ");
        experienceDescription.add("Managing Oracle Big Data Appliance Cluster Managing Oracle Big Data SQL Managing Oracel Exadata Appliance Cluster Managing Microsoft SQL Server Managing MySQL Server- Percona Managing AWS Redshift, DynamoDB, RDS, EC2 and S3 bucket Devops : Jenkins, Github, Flyway, Code Commit, Code Deploy, Code Pipeline, Elastic Beanstalk Data Engineering: Python, Airflow Infrastructure as Code : Terraform, CLoudFormation, Troposphere");

        // DS profiles
        //experienceDescription.add("Supervised learning, optimisation, pandas, scikit-learn, pyspark, hive, jupyter");
        //experienceDescription.add("Predictive modeling, pandas, scikit-learn, python, jupyter, matplotlib, bokeh, exasol, numpy, sql");
        experienceDescription.add("Revenue optimization for hotels metasearch engines. Data mining of hotel information. Machine learning modeler.  Technologies: - Python - Pandas - Numpy - Bokeh - MongoDB");
        experienceDescription.add("Data Science, Product, Strategy and Engineering - I advise companies including FMCG, Tech companies, Telco on leveraging their data and converting that into business value. (2014 - now) - Clients include venture-backed companies funded by Index Ventures, Balderton Capital, Northzone and other top investors. - My engagements range from proof of concepts and workshops to private executive briefings. - Data strategy engagement for a major fintech player. - Data Strategy and analysis work for early stage companies - Delivering compliant Data Science infrastructure to a larger financial institution - Delivering bespoke Bayesian models for various companies including retail companies. - Owning and improving the data engineering infrastructure for a fast growing mobile app Edtech startup using Terraform, Snowplow Analytics, Jenkins, Python, AWS Lambdas and Kinesis.  Mentor - I mentor Junior Data Scientists and Engineers, and am particularly interested in helping members of under-represented communities speak at Tech conferences. (2016 - now)  Teaching Assistant and Lecturer: - General Assembly (2016 - now) - University of Luxembourg internal workshops (2013)  Speaker: - I mostly speak about deploying data science and probabilistic programming (2013 - Now)");
        experienceDescription.add("Elevate Direct is a highly sophisticated AI and machine learning talent acquisition platform, specially designed to increase the productivity of your talent function and hiring communities across all workforce categories.  I worked on the data product side bringing R and D to production. I also worked on sales and marketing analysis to enhance our value proposition. My business development work brought in revenue and finally I taught classes internally on AI.  I work with technologies such as Python, Tensorflow and Spark - for building and maintaining our data products. I built some Convolutional Neural Network models and evaluated some of the infrastructure for deploying these models.  In conjunction to shipping data products - such as the market ranking functionality (with a small team) I also wrote some PR pieces, did blog posts, presented research on Variational Inference internally, did a webinar and spoke publicly about Elevate Direct.");
        experienceDescription.add("Collaboration in the design and implementation of an intelligent solution for AI Health Suite (Clinical Coding). - Natural Language Processing - A recent approach for Deep learning in text classifications: LSTM/GRU, CNN, Hierarchical Attention network and Multitask Learning - Python - CLoud solutions: Azure GPU-VM, Azure Cosmos DB, SQL, Google cloud: GC TPU/GPU VM, GC Bigquery, Spark  Design and development of an intelligent city platform by integrating AI with Agent-based model for transportation data and all relevant city information dataset. - Agent-based Simulation - Deep learning/ RNN-LSTM - Python - Bing REST API - Google Map API - Azure VM-GPU and CosmosDB");
        experienceDescription.add("Deep learning in TR: - Stock price prediction using Deep learning methods: (RNN_LSTM) - Automatic extraction of breaking news events using NLP methods (Deep learning: RNN and CNN) - Fraud detection using Deep learning- ANN/ Regression and unsupervised deep (SOM) Big Data Handling in TR: - Data migration to Google Cloud Bigquery and Bigtable - Handling big data using Graph Database-Neo4j on Google Cloud and Azure - Data migration to Azure Cosmos Db");
        experienceDescription.add("As part of Microsoft-Accenture-Avanade team, we took the concept of RPA a step further; Where we incorporate intelligence by deploying cognitive technologies from Microsoft Azure services to RPA platforms, to combine Machine Learning, Natural-language Processing and process automation, to perform complex tasks without human interference. Deep learning in Accenture: Insurance Claim Handling using Deep learning (CNN): - Prediction of damage costs - Document classification - Claim anti-Fraud Recovery - Settlement Strategy Microsoft Cloud Solutions in Accenture: - Azure Cloud GPU - Azure Machine Learning, Studio and Workbench - Azure Power-BI");

        for(int i = 0; i<experienceDescription.size(); i++){
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println(experienceDescription.get(i));
            String cleanedSentence1 = posSimilarityObject.cleanSentence(experienceDescription.get(i));
            String taggedSentence1 = posSimilarityObject.tagSentence(cleanedSentence1);
            HashMap<String, ArrayList<String>> builtSenetence1Tags = posSimilarityObject.buildSentenceTags(taggedSentence1);

            for(int j = i; j<experienceDescription.size(); j++){
                System.out.println(experienceDescription.get(j));
                String cleanedSentence2 = posSimilarityObject.cleanSentence(experienceDescription.get(j));
                String taggedSentence2 = posSimilarityObject.tagSentence(cleanedSentence2);
                HashMap<String, ArrayList<String>> builtSenetence2Tags = posSimilarityObject.buildSentenceTags(taggedSentence2);
                System.out.println("la similarite est = ");
                System.out.println(posSimilarityObject.posFiltredSimilarity(builtSenetence1Tags, builtSenetence2Tags));
            }
        }
    }

}
