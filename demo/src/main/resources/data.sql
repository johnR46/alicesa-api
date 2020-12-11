


DROP TABLE IF EXISTS register_patient;

CREATE TABLE register_patient (
  id_register_patient INT AUTO_INCREMENT  PRIMARY KEY,
  fristname_lastname VARCHAR(255) NOT NULL,
  id_card  NUMBER(13) NULL,
  birthday VARCHAR(20) NOT NULL,
  address VARCHAR(255) NOT NULL,
  phone VARCHAR(10) NOT NULL
);
INSERT INTO register_patient VALUES (1, 'Bancha nonphala', 2341100021143, '20xx', '30/2','09xx');


DROP TABLE IF EXISTS  login_doctor;

CREATE TABLE login_doctor (
  id_login_doctor INT AUTO_INCREMENT  PRIMARY KEY,
  user_id VARCHAR(255) NOT NULL,
  user_password VARCHAR(255) NOT NULL
);


DROP TABLE IF EXISTS  login_nurse;

CREATE TABLE login_nurse (
  id_login_nurse INT AUTO_INCREMENT  PRIMARY KEY,
  user_id VARCHAR(255) NOT NULL,
  user_password VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS  patient_history_information;

CREATE TABLE patient_history_information(
  id_patient_history INT AUTO_INCREMENT  PRIMARY KEY,
  fristname_lastname VARCHAR(255) NOT NULL,
  birthday VARCHAR(20) NOT NULL,
  id_card  NUMBER(13) NULL,
  address VARCHAR(255) NOT NULL,
  phone VARCHAR(10) NOT NULL,
  health_information VARCHAR(255),
  travel_information  VARCHAR(255),
  career_information VARCHAR(255),
  assessment_results  VARCHAR(255)
)