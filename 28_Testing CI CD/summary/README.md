# Ringkasan Materi Testing in CI/CD Pipeline

*CI/CD* adalah singkatan dari Continuous Integration dan Continuous Deployment. CI/CD adalah metodologi pengembangan perangkat lunak yang berfokus 
pada otomatisasi dan pengujian secara terus-menerus untuk memastikan bahwa perangkat lunak selalu siap untuk dideploy dan diintegrasikan 
ke dalam lingkungan produksi.

## *Berikut adalah tahapan dalam proses CI/CD:*

1. *Continuous Integration (CI)*, Setiap kali ada perubahan kode, perangkat lunak akan diintegrasikan ke dalam repositori kode bersama dengan pengujian unit otomatis.

-  *Continuous Integration* adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membuat/menguji setiap perubahan secara otomatis, 
   sedini mungkin biasanya beberapa kali sehari.
-  Terbaik dicapai melalui integrasi dengan kontrol versi

2. *Continuous Delivery (CD)*, Setelah pengujian unit telah berhasil, perangkat lunak siap untuk dideploy ke dalam lingkungan staging, di mana pengujian integrasi dan fungsional dapat dilakukan. Jika pengujian berhasil, perangkat lunak dapat dideploy ke dalam lingkungan produksi.
-  *Continuous Delivery* menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan mendorong perubahan secara otomatis 
   ke sistem pementasan.
-  *Continuous Deployment* melangkah lebih jauh dan mendorong perubahan pada produksi secara otomatis
- *Continuous Deployment*, Setelah perangkat lunak telah berhasil melalui pengujian di lingkungan staging, perangkat lunak dapat secara otomatis dideploy 
ke lingkungan produksi.

## *Proses CI/CD membawa banyak manfaat, di antaranya:*

1. Meningkatkan kualitas perangkat lunak: Dengan pengujian otomatis yang dilakukan secara terus-menerus, masalah dan bug dapat diidentifikasi dan 
   diperbaiki sebelum perangkat lunak diintegrasikan ke dalam lingkungan produksi.
2. Meningkatkan efisiensi dan kecepatan: Proses CI/CD membantu meningkatkan efisiensi dan kecepatan dalam pengembangan perangkat lunak, karena pengujian 
   dan deployment dilakukan secara otomatis.
3. Menurunkan risiko: Dengan pengujian otomatis yang dilakukan secara terus-menerus, risiko terjadinya masalah atau bug pada perangkat lunak dapat ditekan.
4. Meningkatkan kolaborasi: Proses CI/CD mendorong kolaborasi antara pengembang dan tim pengujian, sehingga memungkinkan tim untuk lebih efektif 
   dalam mengembangkan dan memperbaiki perangkat lunak.


## *What makes for good CI*

- *Decoupled Stage*
  setiap langkah dalam CI harus melakukan satu tugas terfokus
- *Repeatable*
  otomatis dengan cara yang dapat diulang secara konsisten
  Tooling harus bekerja untuk pengembang lokal juga
- *Fail Fast*
  gagal pada tanda pertama masalah
- *Design With System in mind*
  mencakup banyak mungkin bagian penerapan, seperti : aplikasi, infrastruktut, konfigurasi, data
- *Pipelines*
  terus tingkatkan kepercayaan diri saat anda bergerak menuju produksi
- *globally unique versions*
  tahu keadaan sistem setiap saat
  mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan


## *Berikut ini adalah beberapa CI/CD tools yang sering digunakan dalam proses pengembangan perangkat lunak:*

1. *Jenkins:* Jenkins adalah salah satu tool CI/CD open-source yang paling populer dan banyak digunakan oleh pengembang perangkat lunak. Jenkins mendukung 
   banyak plugin, sehingga dapat diintegrasikan dengan banyak alat pengujian dan pengembangan.
2. *GitLab CI/CD:* GitLab CI/CD adalah fitur CI/CD yang terintegrasi dengan GitLab, sebuah platform pengembangan perangkat lunak yang populer. 
   GitLab CI/CD dapat dijalankan dalam lingkungan cloud atau on-premise.
3. *Travis CI:* Travis CI adalah layanan CI/CD yang memungkinkan pengembang perangkat lunak untuk menjalankan pengujian otomatis pada setiap commit yang 
   diterima di repositori Git. Travis CI mendukung banyak bahasa pemrograman dan lingkungan pengembangan.
4. *CircleCI:* CircleCI adalah layanan CI/CD yang mendukung banyak bahasa pemrograman dan lingkungan pengembangan. CircleCI dapat diintegrasikan dengan 
   banyak alat pengujian dan pengembangan.
5. *Bamboo:* Bamboo adalah alat CI/CD yang dikembangkan oleh Atlassian, perusahaan yang juga mengembangkan Jira dan Confluence. Bamboo dapat diintegrasikan 
   dengan banyak alat pengujian dan pengembangan, seperti Jira, Bitbucket, dan Git.
6. *TeamCity:* TeamCity adalah alat CI/CD yang dikembangkan oleh JetBrains, perusahaan yang juga mengembangkan IntelliJ IDEA dan PyCharm. TeamCity mendukung 
   banyak bahasa pemrograman dan lingkungan pengembangan.
7. *Azure DevOps:* Azure DevOps adalah layanan CI/CD yang terintegrasi dengan Azure, platform cloud dari Microsoft. Azure DevOps mendukung banyak bahasa pemrograman dan lingkungan pengembangan, serta dapat diintegrasikan dengan banyak alat pengujian dan pengembangan.

    Ketika memilih CI/CD tools yang tepat, penting untuk mempertimbangkan kebutuhan tim pengembangan dan kecocokan alat dengan lingkungan pengembangan perangkat lunak yang digunakan.